class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
      
      int dist[]=new int [n];
      Arrays.fill(dist,Integer.MAX_VALUE);
      dist[src]=0;
      for(int i=0;i<=k;i++){
          int cost[]=Arrays.copyOf(dist,n);
          for(int[] flight : flights){
              int u=flight[0],v=flight[1],fare=flight[2];
              if(dist[u]==Integer.MAX_VALUE)continue;
              if(dist[u]+fare<cost[v]) cost[v]=dist[u]+fare;
          }
          dist=cost;
      }
      return dist[dst]==Integer.MAX_VALUE?-1:dist[dst];
    }
}
