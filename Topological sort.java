class Solution
{
    //DFS solution
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
      Stack<Integer> st = new Stack<>();
      Set<Integer> vis = new HashSet<>();
      for(int i=0;i<V;i++){
          if(!vis.contains(i)) dfs(i,vis,st,adj);
      }
      int res[] = new int[st.size()];
      int i=0;
      while(!st.isEmpty()){
          res[i] = st.pop();
          i++;
      }
      return res;
    }
    static void dfs(int idx, Set<Integer> vis, Stack<Integer> st, ArrayList<ArrayList<Integer>> adj){
        vis.add(idx);
        for(int a:adj.get(idx)){
            if(!vis.contains(a)) dfs(a,vis,st,adj);
        }
        st.push(idx);
    }
    
    
    //BFS Solution
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
      int indeg[] = new int[V];
      for(int i=0;i<V;i++){
          for(int a : adj.get(i)) indeg[a]++;
      }
      Queue<Integer> q = new LinkedList<>();
      int ans[] = new int[V];
      for(int i =0;i<V;i++){
          if(indeg[i] == 0) q.add(i);
      }
      
      int i=0;
      while(!q.isEmpty()){
          int curr = q.poll();
          ans[i++] = curr;
          for(int a : adj.get(curr)){
              indeg[a]--;
              if(indeg[a] == 0) q.add(a);
          }
      }
      return ans;
    }
}
