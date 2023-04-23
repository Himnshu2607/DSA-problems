class Solution {
    public int numberOfArrays(String s, int k) {
        int dp[] = new int[s.length()];
        Arrays.fill(dp,-1);
        return madad(s,0,k,dp,s.length());
    }
    int madad(String s, int i, int k, int[] dp, int n){
        if(i==s.length()) return 1;
        if(s.charAt(i)=='0') return 0;
        if(dp[i]!=-1) return dp[i];
            long num=0;
            int ans=0;
            for(int j=i;j<s.length();j++){
                num= num * 10 +s.charAt(j)-'0';
                if(num>k) break;
                ans+=madad(s,j+1,k,dp,n);
                ans%=1000000007;
            }
            return dp[i]= ans;
    }
}
