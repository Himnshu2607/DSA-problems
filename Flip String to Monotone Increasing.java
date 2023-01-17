class Solution {
    public int minFlipsMonoIncr(String s) {
       int zero=0,ones=0;
       for(char c:s.toCharArray()){
           if(c=='1')ones++;
           else 
           zero++;
           zero=Math.min(ones,zero);
       }
       return zero;
    }
}
