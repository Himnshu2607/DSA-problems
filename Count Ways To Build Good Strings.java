class Solution {
    int mod = 1000000007;
    public int countGoodStrings(int low, int high, int zero, int one) {
         int dp[] = new int[high+1];
         Arrays.fill(dp,-1);
         int ans = 0;
         for(int i=low;i<=high;i++){
             ans = ((ans%mod) + madad(i,dp,zero,one)%mod)%mod;
         }
         return ans;
    }
    public int madad(int ind,int[] dp,int zero,int one){
        if(ind == 0) return 1;
        if(ind < 0) return 0;
        if(dp[ind]!= -1) return dp[ind];
        int forone = madad(ind-one,dp,zero,one);
        int forzero = madad(ind-zero,dp,zero,one);
        return dp[ind] =(forone+forzero)%mod;
    }

}
