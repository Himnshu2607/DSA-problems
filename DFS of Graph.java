class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> ans = new ArrayList<>();
        boolean vis[] = new boolean[V+1];
        vis[0] = true;
        dfs(0,vis,ans,adj);
        return ans;
    }
    void dfs(int idx,boolean vis[],ArrayList<Integer> ans,ArrayList<ArrayList<Integer>> adj){
        vis[idx] = true;
        ans.add(idx);
        for(int i : adj.get(idx)){
            if(!vis[i]) dfs(i,vis,ans,adj);
        }
    }
}
