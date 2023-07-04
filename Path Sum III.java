class Solution {
    public int pathSum(TreeNode root, int targetSum) {
      if(root == null) return 0;
      return path(root,targetSum) + pathSum(root.left,targetSum) + pathSum(root.right,targetSum);  
    }
    int path(TreeNode root,long sum){
      if(root == null) return 0;
      return (sum == root.val ? 1 : 0) + path(root.left,sum - root.val) + path(root.right,sum-root.val);
    }
}
