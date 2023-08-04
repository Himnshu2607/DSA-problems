class Solution {
    public boolean isPossibleToCutPath(int[][] grid) {
        if(!path(grid,0,0)) return true;
        grid[0][0] = 1;
        return !path(grid,0,0);
    }
    boolean path(int[][] grid,int i,int j){
        if(i == grid.length || j == grid[0].length) return false;
        if(i == grid.length-1 && j == grid[0].length-1) return true;
        if(grid[i][j] == 0) return false;
        grid[i][j] = 0;
        return path(grid,i+1,j) || path(grid,i,j+1);
    }
}
