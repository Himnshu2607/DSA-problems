class Solution{
    static int palindromicPartition(String s)
    {
       int n = s.length();
       int dp[][] = new int[n][n];
       boolean pali[][] = new boolean[n][n];
       for(int i=0;i<n;i++){
           dp[i][i] =0;pali[i][i] = true;
       }
       for(int gap =1;gap<n;gap++){
           for(int i=0;i+gap<n;i++){
               int j = i+gap;
               if(s.charAt(i) == s.charAt(j) &&(pali[i+1][j-1] == true || gap ==1)){
                   dp[i][j] =0;pali[i][j] = true;
               }
               else{
                   pali[i][j] = false;
                   dp[i][j] = Integer.MAX_VALUE;
                   for(int k=i;k<j;k++) 
                   dp[i][j] = Math.min(dp[i][j],1+dp[i][k]+dp[k+1][j]);
               }
           }
       }
       return dp[0][n-1];
    }
}
