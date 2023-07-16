class Solution {
    public int countDistinctIntegers(int[] nums) {
      Set<Integer> set = new HashSet<>();
      for(int n : nums){
          set.add(n);
          set.add(revs(n));
      }  
      return set.size();
    }
    int revs(int n){
        int rev=0;
        while(n>0){
            rev = rev *10 + n%10;
            n /= 10;
        }
        return rev;
    }
}
