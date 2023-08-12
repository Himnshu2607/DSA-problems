class Solution {
    public int minDeletionSize(String[] strs) {
        int len = strs[0].length();
        int dp[] = new int[len];
        int max = 0;
        for(int i =0;i<len;i++){
            dp[i] =1;
            for(int j=0;j<i;j++){
                if(solve(j,i,strs)) dp[i] = Math.max(dp[i] ,dp[j]+1);
            }
            max = Math.max(max,dp[i]);
        }
        return len - max;
    }
    boolean solve(int i,int j,String[] strs){
        for(String s:strs){
            if(s.charAt(i) > s.charAt(j)) return false;
        }
        return true;
    }
}
