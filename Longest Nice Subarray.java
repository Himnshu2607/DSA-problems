class Solution {
    public int longestNiceSubarray(int[] nums) {
        int j=0,temp =0,ans=1;
        for(int i=0;i<nums.length;i++){
            while((temp & nums[i]) != 0) temp ^= nums[j++];
            temp |= nums[i];
            ans = Math.max(ans,i-j+1);
        }
        return ans;
    }
}
