/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int helper(TreeNode root, int[] max){
        if(root==null) return 0;
        
        int lmax = Math.max(0, helper(root.left, max));
        int rmax =  Math.max(0, helper(root.right, max));
        
        max[0] = Math.max(max[0], root.val + lmax + rmax);
        return Math.max(lmax, rmax) + root.val;
    }
    public int maxPathSum(TreeNode root) {
        int a[] = new int[1];
        a[0] = Integer.MIN_VALUE;
        helper(root, a); 
        return a[0];
    }
}