class Solution {
    int max = 0;
    public int longestZigZag(TreeNode root) {
        madad(root,0,true);
        madad(root,0,false);
        return max;
    }
    void madad(TreeNode root,int steps,boolean isleft){
        if(root == null) return;
        max = Integer.max(max,steps);
        madad(root.left,isleft ? 1 : steps+1  , true);
        madad(root.right,isleft ? steps+1 : 1 , false);
    }
}
