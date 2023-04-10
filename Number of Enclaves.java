class Solution {
    public int numEnclaves(int[][] grid) {
      int n=grid.length,m=grid[0].length;
      int count=0;
      for(int i=0;i<n;i++){
          for(int j=0;j<m;j++){
              if((i==0 || j==0 || i==n-1 || j==m-1) && grid[i][j]==1)countIsland(i,j,grid);
          }
      }  
      for(int i=0;i<n;i++){
          for(int j=0;j<m;j++){
              count+= grid[i][j];
          }
      }
      return count;
    }

    void countIsland(int x,int y,int grid[][]){
        int n=grid.length,m=grid[0].length;
        if(x<0 || y<0 || x>=n || y>=m ||grid[x][y]==0) return;
        grid[x][y]=0;
        countIsland(x+1,y,grid);
        countIsland(x-1,y,grid);
        countIsland(x,y+1,grid);
        countIsland(x,y-1,grid);
        
    }
}
