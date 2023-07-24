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
    ArrayList<Integer> ans = new  ArrayList<>();
    
    public List<Integer> rightSideView(TreeNode root) {
        pre(root,0,ans);
        return ans;
        
    }
    public void pre(TreeNode root, int level,  ArrayList<Integer> ans){
        if(root==null) return;
        
        if(level==ans.size()) ans.add(root.val);
        pre(root.right, level+1,ans);
        pre(root.left, level+1, ans);
    }
}