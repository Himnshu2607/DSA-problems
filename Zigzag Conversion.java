class Solution {
    public String convert(String s, int numRows) {
       if(numRows==1) return s;
       StringBuilder ans=new StringBuilder();
       int n=s.length();
       int k=2*(numRows-1);
       for(int i=0;i<numRows;i++){
           int index=i;
           while(index<n){
               ans.append(s.charAt(index));
               if(i!=0 && i!=numRows-1 )
               {
                   int k1=k-(2*i);
                   int k2=k1+index;
                   if(k2<n) ans.append(s.charAt(k2));
               }
               index+=k;
           }
       }
       return ans.toString(); 
    }
}
