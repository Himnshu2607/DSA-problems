class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        int ans =0;
        boolean[] vis = new boolean[n];
        for(int i =0;i<n;i++){
            if(!vis[i]){
                ans++;
                dfs(isConnected,vis,i);
            }
        }
        return ans;
    }

    void dfs(int[][] isConnected,boolean[] vis,int n){
        vis[n] = true;
        for(int i =0 ;i<isConnected.length;i++)
        if(isConnected[n][i] ==1 && !vis[i]) dfs(isConnected,vis,i);
    }    
}
