class Solution {
    int dp[][][];
public int profitableSchemes(int n, int minProfit, int[] group, int[] profit) {
     dp = new int[n+1][group.length][minProfit+1];
    for (int d[][] : dp){
        for(int e[] : d) Arrays.fill(e,-1);  
    }
    return madad(minProfit, group, profit, n, 0);
    }
    int madad(int minProfit, int[] group, int[] profit, int maxPeople, int idx){
        if(maxPeople < 0) return 0;
        if(idx == group.length) return minProfit<= 0 ? 1 : 0;
        if(minProfit < 0) minProfit = 0;
        if(dp[maxPeople][idx][minProfit] !=-1) return dp[maxPeople][idx][minProfit];
        int pick = madad(minProfit - profit[idx], group, profit, maxPeople - group[idx], idx+1);
        int notPick = madad(minProfit, group, profit, maxPeople, idx+1); 
        return dp[maxPeople][idx][minProfit] = (int)(pick + notPick) %1000000007;
    }
}
