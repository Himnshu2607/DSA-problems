class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        Map<Integer,List<Integer>> map = new HashMap<>();
        for(int[] seats : reservedSeats){
            if(!map.containsKey(seats[0])) map.put(seats[0],new ArrayList<>());
            map.get(seats[0]).add(seats[1]);
        }
        int count =0;
        for(List<Integer> resMap : map.values()){
            boolean flag = false;
            if(!resMap.contains(2) && !resMap.contains(3) && !resMap.contains(4) && !resMap.contains(5)){
                count++;flag = true;
            }
            if(!resMap.contains(6) && !resMap.contains(7) && !resMap.contains(8) && !resMap.contains(9)){
                count++;flag = true;
            }
            if(!flag && !resMap.contains(4) && !resMap.contains(5) && !resMap.contains(6) && !resMap.contains(7)) count++;
            n--;
        }
        if(n > 0) count += n*2;
        return count;
    }
}
