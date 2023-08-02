class Solution {
    int mod = 1000000007;
    public int knightDialer(int n) {
        long ans= 0;
        long dp[][][] = new long[4][3][n];
        for(int i=0;i<4;i++){
            for(int j=0;j<3;j++){
               ans = ans%mod + calculate(i,j,n-1,dp)% mod;
            }
        }
        return (int)ans;
    }
    long calculate(int r,int c,int n,long[][][] dp){
        if(r<0 || r>=4 || c<0 || c>=3) return 0;
        if((c ==0 && r==3) || c == 2 && r==3) return 0;
        if(n == 0) return 1;
        if(dp[r][c][n] >0) return dp[r][c][n];
        dp[r][c][n] = calculate(r-2,c-1,n-1,dp)%mod+
        calculate(r-2,c+1,n-1,dp)%mod+
        calculate(r+2,c-1,n-1,dp)%mod+
        calculate(r+2,c+1,n-1,dp)%mod+
        calculate(r-1,c-2,n-1,dp)%mod+
        calculate(r-1,c+2,n-1,dp)%mod+
        calculate(r+1,c-2,n-1,dp)%mod+
        calculate(r+1,c+2,n-1,dp)%mod;
        return dp[r][c][n];
    }
}
