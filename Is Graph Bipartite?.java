class Solution {
    public boolean isBipartite(int[][] graph) {
    int n = graph.length;
    int color[] = new int[n];
    Arrays.fill(color,0);

    for(int i=0;i<n;i++){
        if(color[i] != 0) continue;
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        color[i]=1;
        while(!q.isEmpty()){
            int curr = q.peek();
            q.remove();

            for(int neigh : graph[curr]){
                if(color[neigh] ==0){
                    color[neigh] = -color[curr];
                    q.add(neigh);
                }
                else if(color[neigh] != -color[curr]) return false;
            }
        }
    }
    return true;
    }
}
