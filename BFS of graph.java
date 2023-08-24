class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[V];
        vis[0] = true;
        q.add(0);
        while(!q.isEmpty()){
            int curr = q.poll();
            ans.add(curr);
            
            for(int i : adj.get(curr)){
                if(!vis[i]){
                    vis[i] = true;
                    q.add(i);
                }
            }
        }
        return ans;
    }
}
