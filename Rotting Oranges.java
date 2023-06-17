class Solution {
    public int orangesRotting(int[][] grid) {
        if(grid == null || grid.length==0) return -1;
        for(int i =0;i<grid.length;i++){
            for(int j =0;j<grid[0].length;j++){
                if(grid[i][j] ==2) dfs(grid,i,j,2);
            }
        }
        int mint = 2;
        for(int row[] : grid){
            for(int cell : row){
                if(cell == 1) return -1;
                mint = Math.max(mint,cell);
            }
        }
        return mint-2;
    }
    void dfs(int grid[][] ,int i,int j,int mint){
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]==0 || (1<grid[i][j] && grid[i][j] < mint)) return;
        grid[i][j] = mint;
        dfs(grid,i+1,j,mint+1);
        dfs(grid,i-1,j,mint+1);
        dfs(grid,i,j+1,mint+1);
        dfs(grid,i,j-1,mint+1);
    }
}
