class Solution {
    public List<Integer> findAnagrams(String s, String p) {
       List<Integer> ans =new ArrayList<>();
       int chr[]=new int[26];
       for(char ch:p.toCharArray())
       chr[ch-'a']++;

       int left=0,right=0,count=p.length();
       while(right<s.length()){
           if(chr[s.charAt(right++)-'a']-->=1) count--;
           if(count==0) ans.add(left);
           if(right-left==p.length() && chr[s.charAt(left++)-'a']++ >=0) count++;
       }
       return ans;
    }
}
