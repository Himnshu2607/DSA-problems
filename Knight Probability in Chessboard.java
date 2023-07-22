class Solution {
    double dp[][][];
    int dirx[] = {1,1,-1,-1,2,2,-2,-2};
    int diry[] = {-2,2,-2,2,-1,1,-1,1};
    public double knightProbability(int n, int k, int row, int col) {
        dp = new double[n][n][k+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++) {
                Arrays.fill(dp[i][j],-1.0);
            }
        }
        double ans = find(n,k,row,col);
        double prob = Math.pow(8,k);
        return ans/prob;
    }
    Double find(int n,int k,int row,int col){
        if(row<0 || row>=n || col<0 || col>=n) return 0.0;
        if(k == 0) return 1.0;
        if(dp[row][col][k] != -1.0) return dp[row][col][k];
        double prob =0;
        for(int i=0;i<8;i++) prob += find(n,k-1,row+dirx[i],col+diry[i]);
        return dp[row][col][k] = prob;
    }
}
