class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
      int n=graph.length;
      boolean[] vis = new boolean[n];
      int arr[] = new int[n]; 
      for(int i=0;i<n;i++){
          if(arr[i] == 0){
              vis[i] = true;
              dfs(i,graph,arr,vis);
              vis[i] = false;
          }
      }
      List<Integer> res = new ArrayList<>();
      for(int i=0;i<arr.length;i++){
          if(arr[i] == 1) res.add(i);
      } 
      return res;
    }

    boolean dfs(int i,int[][] graph,int arr[],boolean[] vis){
        boolean isSafe = true;
        for(int neighbour : graph[i]){
            if(vis[neighbour] || arr[neighbour] ==2){
                isSafe = false;
                break;
            }
            if(arr[neighbour] == 1) continue;
            vis[neighbour] = true;
            if(!dfs(neighbour,graph,arr,vis)) isSafe = false;
            vis[neighbour] = false;
        }
        arr[i] = isSafe ? 1:2;
        return isSafe;
    }
}
