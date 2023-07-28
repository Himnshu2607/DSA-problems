class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
       return construct(nums,0,nums.length); 
    }
    TreeNode construct(int nums[],int l,int r){
        if(l==r) return null;
        int maxi = max(nums,l,r);
        TreeNode root = new TreeNode(nums[maxi]);
        root.left = construct(nums,l,maxi);
        root.right = construct(nums,maxi+1,r);
        return root;
    }
    int max(int nums[],int l,int r){
        int maxi = l;
        for(int i=l;i<r;i++){
            if(nums[maxi] < nums[i]) maxi = i;
        }
        return maxi;
    }
}
