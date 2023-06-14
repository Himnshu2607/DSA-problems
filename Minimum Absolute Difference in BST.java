class Solution {
    TreeNode back;
    int min = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
       if(root.left!=null)  getMinimumDifference(root.left);
       if(back != null) min = Math.min(min,root.val - back.val);
       back = root;
       if(root.right!= null) getMinimumDifference(root.right);
       return min;
    }
}
