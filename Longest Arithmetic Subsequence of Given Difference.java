class Solution {
    public int longestSubsequence(int[] arr, int difference) {
        Map<Integer,Integer> map = new HashMap<>();
        int ans = 1;
        for(int  a : arr){
            int beforeA = map.getOrDefault(a - difference,0);
            map.put(a,beforeA+1);
            ans = Math.max(ans,map.get(a));
        }
        return ans;
    }
}
