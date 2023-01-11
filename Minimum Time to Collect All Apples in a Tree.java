class Solution {
    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());
        for(int[] edge: edges){
            int u=edge[0];
            int v=edge[1];

            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        boolean visited[]=new boolean[n];
          return dfs(adj,hasApple,visited,0);
    }
    int dfs(List<List<Integer>> adj,List<Boolean> hasApple,boolean visited[],int source){
        visited[source]=true;
        int time=0;
                for(int vertex: adj.get(source)){
            if(visited[vertex]==false) time+=dfs(adj,hasApple,visited,vertex);
        }
        if(source!=0 &&(time>0 || hasApple.get(source))) return time+=2;
        return time;
    }
}
