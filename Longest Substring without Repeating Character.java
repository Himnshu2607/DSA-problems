class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if(n == 0) return 0;
        int l=0,r=0;
        int max = Integer.MIN_VALUE;
        Set<Character> set = new HashSet<>();
            while(l<n && r<n){
                if(!set.contains(s.charAt(r))){
                    set.add(s.charAt(r++));
                    max = Math.max(max,r-l);
                }
                else {
                    set.remove(s.charAt(l++));
                    max = Math.max(max,r-l);
                }
            }
        return max;
    }
}
