class Solution {
    public int minFlips(String target) {
       int ans =0,temp=0;
       for(char ch : target.toCharArray()){
           if(ch-'0' != temp){
               temp = ch-'0';
               ans++;
           }
       }
       return ans; 
    }
}
