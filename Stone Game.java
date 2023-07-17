class Solution {
    public boolean stoneGame(int[] piles) {
        int n = piles.length,a=0,b=0;
        for(int i=0;i<n/2;i++){
            int min = piles[i];
            int max = piles[n-i-1];
            a += Math.max(max,min);
            b += Math.min(max,min);
        }
        return a>b;
    }
}
