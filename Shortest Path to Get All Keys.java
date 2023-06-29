class Solution {
    class State{
        int keys,i,j;
        State(int keys,int i,int j){
            this.keys = keys;
            this.i = i;
            this.j = j;
        }
    }
    public int shortestPathAllKeys(String[] grid) {
      int x = -1,y = -1,m = grid.length,n = grid[0].length(),totalKeys = 0;
      for(int i=0;i<m;i++){
          for(int j =0;j<n;j++){
              char c = grid[i].charAt(j);
              if(c == '@'){
                  x = i;
                  y = j;
              } 
              if(c >= 'a' && c <= 'f') totalKeys++;
          }
      }
      State start = new State(0,x,y);
      Queue<State> q = new LinkedList<>();
      Set<String> vis = new HashSet<>();
      vis.add(0 +" "+ x +" "+ y); 
      q.add(start);
      int[][] dirs = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
      int step = 0;
      while(!q.isEmpty()){
          int size = q.size();
          while(size-- >0){
              State curr = q.poll();
           if (curr.keys == (1 << totalKeys) - 1) {
                    return step;
                }
                for (int[] dir : dirs) {
                    int i = curr.i + dir[0];
                    int j = curr.j + dir[1];
                    int keys = curr.keys;
                    if (i >= 0 && i < m && j >= 0 && j < n) {
                        char c = grid[i].charAt(j);
                        if (c == '#') {
                            continue;
                        }
                        if (c >= 'a' && c <= 'f') {
                            keys |= 1 << (c - 'a');
                        }
                        if (c >= 'A' && c <= 'F' && ((keys >> (c - 'A')) & 1) == 0) {
                            continue;
                        }
                        if (!vis.contains(keys + " " + i + " " + j)) {
                            vis.add(keys + " " + i + " " + j);
                            q.offer(new State(keys, i, j));
                        }
                    }
                }
            }
            step++;
        }
        return -1;
    }
}
