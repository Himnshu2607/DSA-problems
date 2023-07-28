class Solution {
    int dp[][];
    public boolean PredictTheWinner(int[] nums) {
        int n = nums.length;
        dp = new int[n][n];
        return helper(nums,0,n-1) >=0;
    }
    int helper(int[] nums,int left,int right){
        if(dp[left][right] != 0) return dp[left][right];
        if(left == right) return nums[right];
        return dp[left][right] = Math.max(nums[left] - helper(nums,left+1,right) , nums[right] - helper(nums,left,right-1));
    }
}
