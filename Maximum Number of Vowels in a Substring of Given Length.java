class Solution {
    public int maxVowels(String s, int k) {
        Set<Character> vowel = new HashSet<>(Arrays.asList('a','e','i','o','u'));
   int count=0,max=0;
   for(int i=0;i<s.length();i++){
       if(vowel.contains(s.charAt(i))) count++;
       if(i>=k && vowel.contains(s.charAt(i-k))) count--;
       max = Math.max(count,max);
   }
   return max;
 } 
}
