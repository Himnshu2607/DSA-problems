class Solution {
    int max = 0;
    public int getMaximumGold(int[][] grid) {
      for(int i =0;i<grid.length;i++){
          for(int j=0;j<grid[0].length;j++){
              if(grid[i][j] != 0) dfs(grid,i,j,0); 
          }
      }  
      return max;
    }
    void dfs(int grid[][],int i,int j,int curr){
        if(i<0 || i>= grid.length || j<0 || j>=grid[0].length || grid[i][j]==0) {
            max = Math.max(max,curr);
            return;
        }
        int temp = grid[i][j];
        grid[i][j] = 0;
        dfs(grid,i+1,j,temp+curr);
        dfs(grid,i-1,j,temp+curr);
        dfs(grid,i,j-1,temp+curr);
        dfs(grid,i,j+1,temp+curr);
        grid[i][j] = temp;
    }
}
