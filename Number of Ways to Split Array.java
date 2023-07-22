class Solution {
    public int waysToSplitArray(int[] nums) {
        long sum=0,curr=0;
        for(int n : nums) sum += n;
        int ans=0;
        for(int i=0;i<nums.length-1;i++){
            curr += nums[i];
            if(sum - curr <= curr) ans++;
        }
        return ans;
    }
}
