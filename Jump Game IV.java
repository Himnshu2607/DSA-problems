class Solution {
    public int minJumps(int[] arr) {
      int n=arr.length;
      Map<Integer,List<Integer>> map=new HashMap();
      for(int i=0;i<n;i++) map.computeIfAbsent(arr[i],k -> new ArrayList()).add(i);
      Queue<Integer> q=new LinkedList();
      boolean visited[] =new boolean[n];
      q.add(0);
      visited[0] =true;
      int steps=0;
      while(!q.isEmpty()){
          int size=q.size();
          while(size-- > 0){
              int curr=q.poll();
              if(curr==n-1) return steps;
              List<Integer> adj=map.get(arr[curr]);
              adj.add(curr-1);
              adj.add(curr+1);
              for(int aj : adj){
                  if(aj>=0 && aj<n && !visited[aj]){
                      q.add(aj);
                      visited[aj]=true;
                  }
               }
                adj.clear();
          }
              steps++;
          }
          return -1;
      } 
    }
