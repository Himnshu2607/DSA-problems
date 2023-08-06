class Solution {
    public int maximumBeauty(int[] nums, int k) {
        Arrays.sort(nums);
        int ans =0;
        for(int l=0,r=0;r<nums.length;r++){
            if(nums[r] - nums[l] >
            
             2*k) l++;
            ans = Math.max(ans,r-l+1);
        }
        return ans;
    }
}
