class Solution {
     TreeNode previous;
     int mindiff=Integer.MAX_VALUE;
    public int minDiffInBST(TreeNode root) { 
       if(root.left!=null) minDiffInBST(root.left);
       if(previous!=null) mindiff=Math.min(mindiff,root.val-previous.val);
       previous=root;
       if(root.right!=null) minDiffInBST(root.right);
       return mindiff;
    }
}
