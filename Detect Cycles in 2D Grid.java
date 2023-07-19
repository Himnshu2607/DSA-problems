class Solution {
    int count =0;
    public boolean containsCycle(char[][] grid) {
        int m = grid.length,n = grid[0].length;
        int vis[][] = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(vis[i][j] == 0 && dfs(i,j,grid,vis,i,j,grid[i][j])) return true;
            }
        }
        return false;
    }
    boolean dfs(int i,int j,char[][] grid,int[][] vis,int prei,int prej,char c){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]!=c) return false;
        if(vis[i][j] - vis[prei][prej] >=3) return true;
        if(vis[i][j] != 0) return false;
        vis[i][j] = count++;
        return dfs(i+1,j,grid,vis,i,j,c) || dfs(i,j+1,grid,vis,i,j,c) || dfs(i-1,j,grid,vis,i,j,c) ||dfs(i,j-1,grid,vis,i,j,c);
    }
}
