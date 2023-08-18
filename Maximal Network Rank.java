class Solution {
    public int maximalNetworkRank(int n, int[][] roads) {
        int max =0;
        Map<Integer,Set<Integer>> map = new HashMap<>();
        for(int[] road : roads){
            map.computeIfAbsent(road[0],k-> new HashSet<>()).add(road[1]);
            map.computeIfAbsent(road[1],k-> new HashSet<>()).add(road[0]);
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int curr = map.getOrDefault(i,Collections.emptySet()).size()+map.getOrDefault(j,Collections.emptySet()).size();
                if(map.getOrDefault(i,Collections.emptySet()).contains(j)) curr--;
                max = Math.max(max,curr);
            }
        }
        return max;
    }
}
