class Solution {
    Boolean[][] dp;
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int n : nums) sum+=n;
        if(sum %2 !=0) return false;
        sum /=2;
        dp = new Boolean[nums.length+1][sum+1];
        return helper(nums,0,sum);
    }
    boolean helper(int nums[],int i,int sum){
        if(sum == 0) return true;
        else if(i >= nums.length || sum <0) return false;
        if(dp[i][sum] != null) return dp[i][sum];
        return dp[i][sum] = helper (nums,i+1,sum-nums[i]) || helper(nums,i+1,sum);
    }
}
