class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        if(nums.length==1) return nums[0];
        int sum=0;
        for(int i=0;i<nums.length;i++)sum+=nums[i];
        int max=nums[0];
        int curr_max=nums[0];
        int min=nums[0];
        int curr_min=nums[0];
        for(int i=1;i<nums.length;i++){
            max=Math.max(nums[i],nums[i]+max);
            curr_max=Math.max(curr_max,max);

            min=Math.min(nums[i],nums[i]+min);
            curr_min=Math.min(curr_min,min);
        }
        if(curr_min==sum) return curr_max;
        return Math.max(curr_max,sum-curr_min);
    }
}
