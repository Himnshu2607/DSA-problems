class Solution {
    public TreeNode balanceBST(TreeNode root) {
      List<Integer> nums = new ArrayList<>();
      inorder(nums,root);
      return helper(nums,0,nums.size() - 1);  
    }
    void inorder(List<Integer> nums,TreeNode root){
        if(root == null) return;
        inorder(nums,root.left);
        nums.add(root.val);
        inorder(nums,root.right);
    }
    TreeNode helper(List<Integer> nums,int l,int r){
        if(l>r) return null;
        int mid = l+(r-l)/2;
        return new TreeNode (nums.get(mid) ,helper(nums,l,mid-1),helper(nums,mid+1,r));
    }
}
