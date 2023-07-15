class Solution {
    public long gridGame(int[][] grid) {
       int n =grid[0].length;
       long ans = Long.MAX_VALUE;
       long sumRow1 = Arrays.stream(grid[0]).asLongStream().sum();
       long sumRow2 =0; 
       for(int i=0;i<n;i++){
           sumRow1 -=grid[0][i];
           ans =  Math.min(ans,Math.max(sumRow1,sumRow2));
           sumRow2 +=grid[1][i];
       }
       return ans;
    }
}
