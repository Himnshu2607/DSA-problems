class Solution {
    public int closedIsland(int[][] grid) {
        int count = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==0 && countIsland(i,j,grid)) count++;
            }
        }
        return count;
    }
    boolean countIsland(int x,int y,int grid[][]){
        if(x<0 || y<0 || x>=grid.length || y>=grid[0].length) return false;
        if(grid[x][y] == 1) return true;
        grid[x][y]=1;
        boolean a= countIsland(x+1,y,grid);
        boolean b= countIsland(x-1,y,grid);
        boolean c= countIsland(x,y+1,grid);
        boolean d= countIsland(x,y-1,grid);

        return a && b && c && d;
    }
}
