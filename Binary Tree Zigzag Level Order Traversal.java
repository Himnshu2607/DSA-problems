class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null) return new ArrayList<>();
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int count=q.size();
            List<Integer> ans=new ArrayList<>();
            for(int i=0;i<count;i++){
                TreeNode curr=q.poll();
                ans.add(curr.val);
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
            res.add(ans);
        }
        for(int i=1;i<res.size();i+=2) Collections.reverse(res.get(i));
        return res;
    }
}
