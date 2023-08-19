class Solution{

	public int minCoins(int coins[], int m, int v) 
	{ 
	    int dp[] = new int[v+1];
	    dp[0] =0;
	    for(int i=1;i<=v;i++) dp[i] = Integer.MAX_VALUE;
	    for(int i=0;i<=v;i++){
	    for(int j=0;j<m;j++){
	        if(coins[j] <= i){
	            int temp = dp[i - coins[j]];
	            if(temp != Integer.MAX_VALUE && temp +1 < dp[i]) dp[i] = temp+1;
	        }
	    }  
	    }
	    if(dp[v] ==Integer.MAX_VALUE) return -1;
	    return dp[v];
	} 
}
