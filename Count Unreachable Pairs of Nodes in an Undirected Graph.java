class Solution {
    int dfs(int curr,boolean[] visited,List<List<Integer>> adj){
        visited[curr] = true;
        int cnt = 1;
        for(int z : adj.get(curr)){
            if(!visited[z]) cnt+=dfs(z,visited,adj);
        }
        return cnt;
    }
    public long countPairs(int n, int[][] edges) {
    long ans=0;
    List<List<Integer>> adj = new ArrayList<>();
    for(int i=0;i<n;i++) adj.add(new ArrayList<>());
        for(int edge[] : edges){
            int u=edge[0];
            int v=edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        boolean[] visited = new boolean[n];
        int vis=0;
        for(int i=0;i<n;i++){
            if(!visited[i]){
                int cnt=dfs(i,visited,adj);
                ans+=(long)cnt*vis;
                vis+=cnt;
            }
        }
        return ans;
    }
}
