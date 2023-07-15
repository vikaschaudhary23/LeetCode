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
public class BalancedPair{
    boolean isbal = true;
    int height = -1;
}
    
    class Solution {
        public boolean isBalanced(TreeNode root) {
            return balanced(root).isbal;
        }
        public BalancedPair balanced(TreeNode root){
            if(root==null) return new BalancedPair();
            
            BalancedPair l = balanced(root.left);
            BalancedPair r = balanced(root.right);
            BalancedPair obj = new BalancedPair();
            
            obj.height = Math.max(l.height, r.height)+1;
            
            int bf = Math.abs(l.height - r.height);
            
            obj.isbal = l.isbal && r.isbal && bf<=1;
            return obj;
        }
    
}