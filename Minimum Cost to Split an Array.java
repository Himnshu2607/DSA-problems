class Solution {
    public int minCost(int[] nums, int k) {
        int n = nums.length;
        int trim[][] = new int[n][n];
        for(int i=0;i<n;i++){
            int freq[] = new int[n];
            int sum =0;
            for(int j=i;j<n;j++){
                freq[nums[j]]++;
                if(freq[nums[j]] ==2) sum +=2;
                if(freq[nums[j]] >2) sum++;
                trim[i][j] = sum;
            }
        }
        int dp[] = new int[n+1];
        for(int i=1;i<=n;i++){
            int min =Integer.MAX_VALUE;
            for(int j=0;j<i;j++) min = Math.min(min,dp[j]+k+trim[j][i-1]);
            dp[i] = min;
        }
        return dp[n];
    }
}
