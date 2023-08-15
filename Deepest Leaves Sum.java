class Solution {
    public int deepestLeavesSum(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int sum =0;
        while(!q.isEmpty()){
            int size = q.size();
            int curr =0;
            for(int i=0;i<size;i++){
                TreeNode temp = q.poll();
                curr += temp.val;
                if(temp.left!= null) q.add(temp.left);
                if(temp.right!= null) q.add(temp.right);
            }
            sum = curr;
        }
        return sum;
    }
}
