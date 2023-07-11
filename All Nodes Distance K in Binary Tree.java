class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> ans = new ArrayList<>();
        if(root == null) return ans;
        Map<TreeNode,TreeNode> map = new HashMap<>();
        parent(map,root);
        Queue<TreeNode> q = new LinkedList<>();
        Set<TreeNode> vis = new HashSet<>();
        q.add(target);

        while(!q.isEmpty()){
            int s = q.size();
            for(int i=0;i<s;i++){
                TreeNode curr = q.poll();
                vis.add(curr);
                if(k==0) ans.add(curr.val);
                if(map.containsKey(curr) && !vis.contains(map.get(curr))) q.add(map.get(curr));
                if(curr.left!=null && !vis.contains(curr.left)) q.add(curr.left);
                if(curr.right!=null && !vis.contains(curr.right)) q.add(curr.right);
            } 
            k--;
            if(k<0) break;
        }
        return ans;
    }
    void parent(Map<TreeNode,TreeNode> map,TreeNode root){
        if(root == null) return;
        if(root.left!=null) map.put(root.left,root);
        if(root.right!=null) map.put(root.right,root);
        parent(map,root.left);
        parent(map,root.right);
    }
}
