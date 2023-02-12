class Solution {
    public int[] shortestAlternatingPaths(int n, int[][] redEdges, int[][] blueEdges) {
     Map<Integer,List<List<Integer>>> graph=new HashMap<>();

     for(int[] e:redEdges)
     graph.computeIfAbsent(e[0],k->new ArrayList<List<Integer>>()).add(Arrays.asList(e[1],1));

     for(int[] e:blueEdges)
     graph.computeIfAbsent(e[0],k->new ArrayList<List<Integer>>()).add(Arrays.asList(e[1],0));

     boolean[][] visited= new boolean[n][2];
     int[] shortestPath = new int[n];
     Arrays.fill(shortestPath,-1);
     Queue<int[]> q=new LinkedList<>();
     q.offer(new int[]{0,0,-1});
     visited[0][0]=visited[0][1]=true;
     shortestPath[0]=0;
     while(!q.isEmpty()){
         int curr[]=q.poll();
         int node=curr[0],distance=curr[1],prevColor=curr[2];
         if(!graph.containsKey(node)) continue;
         for(List<Integer> next: graph.get(node)){
             int nextNode=next.get(0),color=next.get(1);
             if(!visited[nextNode][color] && prevColor!=color){
                 if(shortestPath[nextNode]==-1) shortestPath[nextNode]=1+distance;
                 visited[nextNode][color]=true;
                 q.offer(new int[]{nextNode,1+distance,color});
             }
         }
     }
     return shortestPath;
    }
}
