class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return tree(nums,0,nums.length-1);
    }
    TreeNode tree(int nums[],int left,int right){
        while(left > right) return null;
            int mid = (left+right)/2;
            TreeNode root = new TreeNode(nums[mid]);
            root.left = tree(nums,left,mid-1);
            root.right = tree(nums,mid+1,right);
        return root;
    }
}
