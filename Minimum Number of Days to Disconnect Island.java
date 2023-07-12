class Solution {
    public int minDays(int[][] grid) {
        if(isIsland(grid) !=1) return 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] == 1){
                    grid[i][j] = 0;
                    if(isIsland(grid) != 1) return 1;
                    grid[i][j] =1;
                }
            }
        }
        return 2;
    }
    int isIsland(int grid[][]){
        int ans =0;
        boolean vis[][] = new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(!vis[i][j] && grid[i][j] == 1){
                    ans++;
                    dfs(vis,grid,i,j);
                }
            }
        }
        return ans;
    }
    void dfs(boolean vis[][],int grid[][],int i,int j){
        if(i<0 || j<0 || i == grid.length || j == grid[0].length || vis[i][j] || grid[i][j] == 0) return;
        vis[i][j] = true;
        dfs(vis,grid,i-1,j);
        dfs(vis,grid,i,j-1);
        dfs(vis,grid,i,j+1);
        dfs(vis,grid,i+1,j);
    }
}
