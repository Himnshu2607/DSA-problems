class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode ans = new TreeNode();
        while(root != null){
            if(root.val == val) return root;
            if(root.val < val){
                root = root.right;
                ans = root;
            }
            else{
                root = root.left;
                ans = root;
            }
        }
        return ans;
    }
}
