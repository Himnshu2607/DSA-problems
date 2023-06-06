class Solution {
    public boolean canMeasureWater(int j1, int j2, int t) {
       if(j1+j2 < t) return false;
       int directions[] = {j1,-j1,j2,-j2};
       Queue<Integer> q = new ArrayDeque<>();
       Set<Integer> visited = new HashSet<>();
       q.add(0);
       visited.add(0);

       while(!q.isEmpty()){
           int curr = q.poll();
           if(curr == t) return true;

           for(int dir : directions){
               int total = dir+curr;
               if(total == t) return true;
               if(total < 0 || total>j1+j2) continue;

               if(!visited.contains(total)){
                   q.add(total);
                   visited.add(total);
               }
           }
       } 
       return false;
    }
}
