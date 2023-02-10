
class Solution {
    public boolean isSymmetric(TreeNode root) {
        // if(root==null) return true;
        // if((root.left == null && root.right!=null) || (root.left != null && root.right==null)) return false;
        // // if(root.left.val!=root.right.val) return false;
        // return isSymmetric(root.left) && isSymmetric(root.right);
        return isValid(root.left, root.right);
    }
 public boolean isValid(TreeNode p,TreeNode q){
        if(p==null && q==null)
            return true;
        if(p==null || q==null || p.val!=q.val)
            return false;
        return isValid(p.left,q.right)&&isValid(p.right,q.left);
        
    }
}