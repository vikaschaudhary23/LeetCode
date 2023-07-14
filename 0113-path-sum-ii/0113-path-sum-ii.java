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
public void backtrack(TreeNode root, List<Integer> l,List<List<Integer>> ans, int target){
        if(root==null) return;
    
        if(root.left==null && root.right==null && target-root.val==0){
            l.add(root.val);
            ans.add(new ArrayList<>(l));
            l.remove(l.size()-1);
        }
    
        l.add(root.val);
        backtrack(root.left, l, ans, target-root.val);
        backtrack(root.right, l, ans, target-root.val);
        l.remove(l.size()-1);
        }
public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
    List<Integer> l = new ArrayList<>();
    backtrack(root, l, ans, targetSum);
        return ans;
        
    }
}