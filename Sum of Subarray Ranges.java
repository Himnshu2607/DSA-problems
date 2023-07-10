class Solution {
    public long subArrayRanges(int[] nums) {
        int n = nums.length;
        long ans=0;
        for(int l=0;l<n;l++){
            int min = nums[l],max = nums[l];
            for(int r=l;r<n;r++){
                max = Math.max(max,nums[r]);
                min = Math.min(min,nums[r]);
                ans += max - min;
            }
        }
        return ans;
    }
}
