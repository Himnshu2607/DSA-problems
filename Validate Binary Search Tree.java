class Solution {
    boolean isvalid = true;
    TreeNode prev = null; 
    public boolean isValidBST(TreeNode root) {
        inorder(root);
        return isvalid;
    }
    void inorder(TreeNode root){
        if(root == null) return;
        inorder(root.left);
        if(prev != null && root.val <= prev.val){
            isvalid = false;
            return;
        }
        prev = root;
        inorder(root.right);
    }
}
