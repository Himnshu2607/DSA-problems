class Solution {
    public int[] findBall(int[][] grid) {
       int m = grid.length;
       int n = grid[0].length;
       int res[] = new int[n];
       for(int i =0;i<n;i++) res[i] = find(0,i,grid);
       return res;

    }
    int find(int row,int col,int[][] grid){
        if(row == grid.length) return col;
        int next = col + grid[row][col];
        if(next<0 || next > grid[0].length-1 || grid[row][col] != grid[row][next]) return -1;
        return find(row+1,next,grid);
    }
}
