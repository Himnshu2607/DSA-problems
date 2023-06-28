class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
      boolean vis[] = new boolean[n];
      int time[][] = new int[n][n];
      int dist[] = new int[n];
      Arrays.fill(dist,Integer.MAX_VALUE);
      dist[k-1] = 0;
      for(int[] t : time) Arrays.fill(t, -1);
      for(int[] e : times) time[e[0] - 1][e[1] - 1] = e[2];

      int max = -1;
      for(int i = 0;i<n;i++){
          int minNode = -1;
          for(int j =0;j<n;j++){
              if(!vis[j] && (minNode == -1 || dist[j] < dist[minNode]))
              minNode = j;
          }
          vis[minNode] = true;
          for(int j = 0;j<n;j++){
              if(time[minNode][j] != -1) dist[j] = Math.min(dist[j],dist[minNode] + time[minNode][j]);
          }
      }
      for(int i = 0;i<n;i++){
          if(dist[i] >= Integer.MAX_VALUE) return -1;
          max = Math.max(max,dist[i]);
      }
      return max;
    }
}
