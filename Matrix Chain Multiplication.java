class Solution{
    static int matrixMultiplication(int n, int arr[])
    {
        int dp[][] = new int[n][n];
        for(int i=0;i<n-1;i++) dp[i][i+1] =0;
        for(int gap=2;gap<n;gap++){
            for(int i = 0;gap+i<n;i++){
                int j=i+gap;
                dp[i][j] = Integer.MAX_VALUE;
                for(int k = i+1;k<j;k++){
                    dp[i][j] = Math.min(dp[i][j],dp[i][k]+dp[k][j]+arr[i]*arr[j]*arr[k]);
                }
            }
        }
        return dp[0][n-1];
    }
}
