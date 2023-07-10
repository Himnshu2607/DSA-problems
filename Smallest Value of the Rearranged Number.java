class Solution {
    public long smallestNumber(long num) {
        boolean negative = (num<0);
        num = Math.abs(num);
        char ch[] = (""+num).toCharArray();
        long ans = 0;
        Arrays.sort(ch);
        if(negative){
            String str ="";
            for(int i=ch.length-1;i>=0;i--){
                str+=ch[i];
            }
            ans = -Long.parseLong(str);
        }
        else{
            int i=0;
            for(i=0;i<ch.length;i++){
                if(ch[i] !='0') break;
            }
            if(i <= ch.length-1){
            char temp = ch[i];
            ch[i] = ch[0];
            ch[0] = temp;
        }
        String res = String.valueOf(ch);
        ans = Long.parseLong(res);
        }
      return ans;  
    }
}
