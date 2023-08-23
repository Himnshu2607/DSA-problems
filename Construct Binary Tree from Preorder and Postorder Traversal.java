class Solution {
    public TreeNode constructFromPrePost(int[] pre, int[] post) {
        return dfs(pre,0,pre.length-1,post,0,post.length-1);
    }
    TreeNode dfs(int pre[],int preStart,int preEnd,int post[],int postStart,int postEnd){
        if(preStart > preEnd) return null;
        TreeNode root = new TreeNode(pre[preStart]);
        if(preStart == preEnd) return root;
        int postIdx = postStart;
        while(post[postIdx] != pre[preStart+1]) postIdx++;
        int len = postIdx - postStart +1;
        root.left = dfs(pre,preStart+1,preStart+len,post,postStart,postIdx);
        root.right = dfs(pre,preStart+len+1,preEnd,post,postIdx+1,postEnd);
        return root;
    }
}
