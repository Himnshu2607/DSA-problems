class Solution {
    public int maxFrequency(int[] nums, int k) {
       Arrays.sort(nums);
      int left=0,right=0;
        long ans=0,sum=0;
        
        while(right<nums.length){
            sum+=nums[right];
            
            while((long)nums[right]*(right-left+1) > sum+k){
                sum-=nums[left];
                left++;
            }
            ans=Math.max(ans, right-left+1);
            right++;
        }
       return (int)ans;
    }
}
