class Solution {
    Map<Integer,Integer> map = new HashMap<>();
    void dfs(TreeNode root,int level){
        if(root== null) return;
        map.put(level,map.getOrDefault(level,0) + root.val);
        dfs(root.left,level+1);
        dfs(root.right,level+1);
    }
    void solve(TreeNode root,int sum,int level){
        if(root == null) return;
        int left = root.left == null ? 0 : root.left.val;
        int right = root.right == null ? 0 : root.right.val;
        solve(root.left,right,level+1);
        solve(root.right,left,level+1);
        root.val = map.get(level) - sum - root.val;
    }
    public TreeNode replaceValueInTree(TreeNode root) {
        dfs(root,0);
        solve(root,0,0);
        return root;
    }
}
