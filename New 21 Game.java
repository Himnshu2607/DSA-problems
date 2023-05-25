class Solution {
    public double new21Game(int n, int k, int maxPts) {
        if(k==0 || n>=k-1+maxPts) return 1.0;
        double[] dp = new double[n+1];
        double prob = 0.0,window = 1.0;
        dp[0] =1.0;
        for(int i = 1;i<=n;i++){
            dp[i] = window / maxPts;
            if(i<k) window += dp[i];
            else prob += dp[i];

            if(i >=maxPts) window -=dp[i - maxPts];
        }
        return prob;
    }
}
