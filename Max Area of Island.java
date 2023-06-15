class Solution {
    int area =0;
    public int maxAreaOfIsland(int[][] grid) {
       int ans = 0;
       for(int i =0;i<grid.length;i++){
           for(int j =0;j<grid[0].length;j++){
               if(grid[i][j]== 1){
                   area = 0;
                   dfs(i,j,grid);
                   ans = Math.max(ans,area);
                }
           }
       }
       return ans; 
    }

    void dfs(int i,int j,int[][] grid){
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j] == 0) return;
            area++;
            grid[i][j]=0;
            dfs(i+1,j,grid);
            dfs(i-1,j,grid);
            dfs(i,j+1,grid);
            dfs(i,j-1,grid);
        }
        
}
