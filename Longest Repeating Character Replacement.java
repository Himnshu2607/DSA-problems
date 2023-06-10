class Solution {
    public int characterReplacement(String s, int k) {
      int start =0,maxLetters =0,maxLength=0;
      String str = s.toLowerCase();
      int[] map = new int[26];

      for(int end =0;end<str.length();end++){
          char right = str.charAt(end);
          map[right -'a'] =map[right -'a']+1 ;
          maxLetters = Math.max(maxLetters,map[right-'a']);

          if(end-start+1 - maxLetters >k){
              int left = str.charAt(start);
              map[left -'a'] = map[left -'a']-1;
              start++;
          }
          maxLength = Math.max(maxLength,end-start+1);
      }
      return maxLength;
    }
}
