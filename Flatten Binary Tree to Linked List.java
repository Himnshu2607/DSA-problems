class Solution {
    public void flatten(TreeNode root) {
        if(root == null) return;
        while(root != null){
            if(root.left!= null){
                TreeNode temp  = root.left,curr = temp;
                while(curr.right!= null) curr = curr.right;
                    curr.right = root.right;
                    root.left = null;
                    root.right = temp; 
            }
            root = root.right;
        }
    }
}
