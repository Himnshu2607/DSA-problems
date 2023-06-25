class Solution {
    int n,finish=0,dp[][];
    public int countRoutes(int[] locations, int start, int finish, int fuel) {
        n = locations.length;
        dp = new int[n][fuel+1];
        this.finish = finish;
        for(int i=0;i<n;i++) Arrays.fill(dp[i],-1);
        return helper(locations,start,fuel);
    }
    int helper(int[] location, int start, int fuel){
        if(fuel < 0) return 0;
        if(dp[start][fuel] != -1) return dp[start][fuel];
        int ans = start == finish ? 1 : 0;
        for(int i =0;i<n;i++){
            if(i != start){
                ans = (ans + helper(location,i,fuel- Math.abs(location[i] - location[start]))) %1000000007;
            }
        }
        return dp[start][fuel] = ans;
    }
}
