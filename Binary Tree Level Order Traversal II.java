class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        helper(res,root,0);
        return res;
    }
    void helper(List<List<Integer>> res,TreeNode root,int level){
        if(root==null) return;
        if(level>=res.size())res.add(0,new ArrayList<Integer>());
        helper(res,root.left,level+1);
        helper(res,root.right,level+1);
        res.get(res.size()-level-1).add(root.val);
    }
}
