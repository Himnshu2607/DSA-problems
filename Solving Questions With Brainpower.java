class Solution {
    public long mostPoints(int[][] questions) {
       int n = questions.length;
       long dp[] = new long[n+1];
       for(int i =n-1 ; i >= 0 ; i--){
           int ques = questions[i][0];
           int jump = questions[i][1];
           int next = Math.min(i+jump+1,n);
           dp[i] =Math.max(dp[i+1],ques+dp[next]); 
       }
      return dp[0];
    }
}
