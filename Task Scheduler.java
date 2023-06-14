class Solution {
    public int leastInterval(char[] tasks, int n) {
      Map<Character,Integer> map = new HashMap<>();
      for(char t : tasks) map.put(t,map.getOrDefault(t,0)+1);
      PriorityQueue<Integer> pq = new PriorityQueue<>(map.size(),Collections.reverseOrder());
      pq.addAll(map.values());

      int res = 0;
      while(!pq.isEmpty()){
          int time = 0;
          List<Integer> li = new ArrayList<>();
          for(int i = 0;i<n+1;i++){
              if(!pq.isEmpty()){
                  li.add(pq.remove() - 1);
                  time++;
              }
          }
          for(int l : li) if(l > 0) pq.add(l);
          res += pq.isEmpty() ? time : n+1;
        }
        return res;
    }
}
