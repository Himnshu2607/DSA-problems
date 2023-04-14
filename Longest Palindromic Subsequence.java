class Solution {
    public int longestPalindromeSubseq(String s) {
        int len = s.length();
        if(s == null || len < 1) return 1;
        int dp[] = new int[len];
        for(int i=0;i<len;i++) dp[i] = 1;
        for(int i=1;i<len;i++){
            int l=0;
            for(int j=i-1;j>=0;j--){
                int temp= dp[j];
                if(s.charAt(i)==s.charAt(j)) dp[j] = l+2;
                l=Math.max(l,temp);
            }
        }
        int ans=0;
        for(int x : dp) ans = Math.max(x,ans);
        return ans;
    }
}
