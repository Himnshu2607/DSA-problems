class Solution {
    boolean check = true;
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root == null) return false;
        int xheight = findHeight(root,x,y);
        int yheight = findHeight(root,y,x);

        if (xheight != yheight) check = false;
        return check;
    }

    int findHeight(TreeNode root, int x,int y) {
        if (root == null)
            return 0;
        if (root.left != null && root.right != null) {
            if(root.left.val == x && root.right.val == y) check = false;
            if(root.left.val == y && root.right.val == x) check = false;
        }
        if(root.val == x) return 1;
        if(findHeight(root.left,x,y) > 0) return findHeight(root.left,x,y)+1;
        if(findHeight(root.right,x,y) > 0) return findHeight(root.right,x,y)+1;
        else return 0;
    }
}
