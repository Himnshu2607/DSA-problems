class Solution {
    List<TreeNode> ans=new ArrayList<>();
    Map<String,Integer> map=new HashMap<>();
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        method(root);
        return ans;
    }
    String method(TreeNode root){
        if(root==null) return "";
       String left= method(root.left);
       String right= method(root.right);
       String curr= root.val+" "+left+" "+right;
       map.put(curr,map.getOrDefault(curr,0)+1);
       if(map.get(curr)==2) ans.add(root);
       return curr;
    }
}
