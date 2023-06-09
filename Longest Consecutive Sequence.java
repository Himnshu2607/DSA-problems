class Solution {
    public int longestConsecutive(int[] nums) {
       Set<Integer> set = new HashSet<>();
       for(int num : nums) set.add(num);
       int ans = 0;
       for(int n : nums){
           if(!set.contains(n-1)){
               int length = 0;
               while(set.contains(n+length)) length++;
               ans = Math.max(ans,length);
           }
       }
       return ans;
    }
}
