class Solution {
    int sum=0,count=0;
    int avg(TreeNode root){
        if(root == null) return 0;
        count++;
        sum+=root.val;
        avg(root.left);
        avg(root.right);
        int avg = sum / count;
        return avg;
    }
    int dfs(TreeNode root){
        if(root == null) return 0;
        int ans=0;sum=0;count=0;
        if(root.val == avg(root)) ans++;
        ans+=dfs(root.left);
        ans+=dfs(root.right);
        return ans;
    }
    public int averageOfSubtree(TreeNode root) {
       return dfs(root);
    }
}
