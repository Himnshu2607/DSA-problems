class Solution {
    public int maxProfit(int[] prices) {
       int n=prices.length,buy=prices[0],profit=0;
       for(int i=0;i<n;i++){
           if(prices[i]<buy) buy=prices[i];
           else if(prices[i]-buy>profit) profit=prices[i]-buy;
       }
       return profit;
    }
}
