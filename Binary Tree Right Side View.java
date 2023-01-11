class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        rview(list,root,0);
        return list;
    }
    void rview(List<Integer> list,TreeNode root,int depth){
        if(root==null) return;
        if(depth==list.size()) list.add(root.val);
        rview(list,root.right,depth+1);
        rview(list,root.left,depth+1);
    }
}
