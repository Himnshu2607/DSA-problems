class Solution {
    int count = 0;

    void count(TreeNode root,int x){
        if(root == null) return;
        if(root.val >= x){
            count++;
            x = root.val;
        }
        count(root.left,x);
        count(root.right,x);
    }
    public int goodNodes(TreeNode root) {
        count(root,root.val);
        return count;
    }
}
