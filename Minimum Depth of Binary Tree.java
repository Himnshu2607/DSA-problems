class Solution {
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        if(root.left != null && root.right != null) return Math.min(left,right)+1;
        return Math.max(left,right) +1;
    }
}    


// 2nd method
class Solution {
    public int minDepth(TreeNode root) {
        return dfs(root);
    }
    int dfs(TreeNode root){
        if(root == null) return 0;
        if(root.left == null) return 1+dfs(root.right);
        if(root.right == null) return 1+dfs(root.left);
        return 1+Math.min(dfs(root.right),dfs(root.left));
    }
}
