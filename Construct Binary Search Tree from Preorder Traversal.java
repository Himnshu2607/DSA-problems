class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
        return tree(preorder,0,preorder.length-1);
    }
    TreeNode tree(int preorder[],int l,int r){
        if(l>r) return null;
        TreeNode root = new TreeNode(preorder[l]);
        int i;
        for(i=l;i<=r;i++){
            if(preorder[i] > root.val) break;
        }
        root.left = tree(preorder,l+1,i-1);
        root.right = tree(preorder,i,r);
        return root;
    }
}
