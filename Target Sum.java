class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for(int n : nums) sum +=n;
        if(sum < target || (sum - target)%2 == 1) return 0;
        int s = (sum - target)/2;
        int dp[] = new int[s+1];
        dp[0] = 1;
        for(int i =0;i<nums.length;i++)
        for(int j =s;j>=nums[i];j--)
        dp[j] += dp[j-nums[i]];

        return dp[s];
    }
}
