public class Solution {
    public int solve(int[] A, int B) {
        int n = A.length;
        Map<Integer,Integer> map = new HashMap<>();
        int count =0,xor =0;
        map.put(0,1);
        for(int i=0;i<n;i++){
            xor ^=A[i];
            if(map.containsKey(xor^B)) count += map.get(xor^B);
            map.put(xor,map.getOrDefault(xor,0)+1);
        }
        return count;
    }
}
