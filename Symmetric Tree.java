class Solution {
    public boolean isSymmetric(TreeNode root) {
        return root == null || solve(root.left,root.right);
    }
    boolean solve(TreeNode left,TreeNode right){
        if(left == null && right == null) return true;
        if(left == null || right == null) return false;
        if(left.val != right.val) return false;
        return solve(left.left,right.right) && solve(left.right,right.left);
    }
}
