class Solution {
    public boolean canCross(int[] stones) {
       Map<Integer,Set<Integer>> map = new HashMap<>();
       int n = stones.length;
       for(int i=0;i<n;i++) map.put(stones[i],new HashSet<Integer>());
       map.get(stones[0]).add(0);

       for(int i=0;i<n;i++){
           int stone = stones[i];
           Set<Integer> set = map.get(stone);
           for(int s : set){
               if(map.containsKey(stone+s-1)){
                   if(s-1>0) map.get(stone+s-1).add(s-1);
               }
               if(map.containsKey(stone+s)){
                   if(s>0) map.get(stone+s).add(s);
               }
               if(map.containsKey(stone+s+1)){
                map.get(stone+s+1).add(s+1);
               }
           }

       }
       if(map.get(stones[n-1]).size()>0) return true;
       return false;
    }
}
