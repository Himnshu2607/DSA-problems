class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
       int dp[] = new int[arr.length+1];
       for(int i=1;i<=arr.length;i++){
           int max = Integer.MIN_VALUE;
           for(int j=1;j<=Math.min(i,k);j++){
               max = Math.max(max,arr[i-j]);
               dp[i] = Math.max(dp[i],dp[i-j] + max *j);
           }
       } 
       return dp[arr.length];
    }
}
