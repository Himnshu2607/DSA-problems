class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        Queue<TreeNode> q = new LinkedList<>();
        Queue<Integer> indq = new LinkedList<>();
        q.add(root);
        indq.add(1);
        int width = 0;

        while(!q.isEmpty()){
        int len = q.size();
        int left = 0, right = 0;
         
         for(int i=0 ; i<len ; i++){
             TreeNode curr = q.poll();
             int ind = indq.poll();
            if(i == 0) left = ind;
            if(i == len -1) right = ind;
            if(curr.left!= null){
                q.add(curr.left);
                indq.add(2*ind);
            }
            if(curr.right!= null){
                q.add(curr.right);
                indq.add(2*ind + 1);
            }  
         }
         width = Math.max(width , right - left +1);
        }
        return width;
    }
}
