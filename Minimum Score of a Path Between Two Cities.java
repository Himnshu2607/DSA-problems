class Solution {
    Map<Integer,List<Integer>> graph=new HashMap<>();
    Map<Integer,Integer> minimum=new HashMap<>();
    Set<Integer> visited =new HashSet<>();

    void makeGraph(int[][] roads,int n){
        for(int i=1;i<=n;i++){
            graph.put(i,new ArrayList<>());
            minimum.put(i,Integer.MAX_VALUE);
        }
        for(int road[] : roads){
            int r1=road[0];
            int r2=road[1];
            int d= road[2];
            graph.get(r1).add(r2);
            graph.get(r2).add(r1); 
           minimum.put(r1,Math.min(d,minimum.get(r1)));
           minimum.put(r2,Math.min(d,minimum.get(r2)));
        }
    }
    
        
        int ans=Integer.MAX_VALUE;
        void dfs(int curr){
            visited.add(curr);
            List<Integer> padosi=graph.get(curr);
            for(int i =0 ;i<padosi.size();i++){
                int road=padosi.get(i);
                if(!visited.contains(road)){
                    ans=Math.min(ans,minimum.get(road));
                    dfs(road);
                }
            }
        }
        public int minScore(int n, int[][] roads) {
            makeGraph(roads,n);
            dfs(1);
            return ans;
    }
}
