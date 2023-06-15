class Solution {
    public int maxLevelSum(TreeNode root) {
        if(root == null) return 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int max = Integer.MIN_VALUE,count =0,level =0;

        while(!q.isEmpty()){
            int size  = q.size();
            int sum =0;
            for(int i =0;i<size;i++){
                TreeNode curr = q.poll();
                sum+= curr.val;
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);   
            }
            count++;
            if(sum > max){
                max = sum;
                level = count;
            }
        }
        return level;
    }
}
