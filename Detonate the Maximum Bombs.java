class Solution {
    void dfs(List<List<Integer>> graph,boolean[] vis,int[] c,int i){
        vis[i] = true;
        c[0]++;
        for(int j : graph.get(i)){
            if(!vis[j]) dfs(graph,vis,c,j);
        }
    }
    public int maximumDetonation(int[][] bombs) {
    int n = bombs.length;
    List<List<Integer>> graph = new ArrayList<>();
    for(int i=0;i<n;i++){
        graph.add(new ArrayList<>());
        for(int j=0;j<n;j++){
            if(i!=j){
                long x1 = bombs[i][0],y1 = bombs[i][1],r1 = bombs[i][2];
                long x2 = bombs[j][0],y2 = bombs[j][1];
                long dis = (x2-x1) * (x2-x1) + (y2-y1) * (y2-y1);
                if(dis <= r1*r1) graph.get(i).add(j);
            }
        }
    }
    int res = Integer.MIN_VALUE;
    for(int i =0;i<n;i++){
        int[] c = new int[1];
        boolean[] vis = new boolean[n];
        dfs(graph,vis,c,i);
        res = Math.max(res,c[0]);
    }
    return res;
        }
}
