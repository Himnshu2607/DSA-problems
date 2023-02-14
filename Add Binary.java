class Solution {
    public String addBinary(String a, String b) {
       StringBuilder str=new StringBuilder();
        
        
        int l1=a.length()-1;
        int l2=b.length()-1;
        
        int carry=0;
        while(l1>=0 || l2>=0){
          int ans=carry;
            if(l1>=0)ans+=a.charAt(l1)-'0';
            if(l2>=0)ans+=b.charAt(l2)-'0';
            str.append(ans%2);
            carry=ans/2;
            l1--;
            l2--;
        }
        if(carry!=0) str.append(carry);
        return str.reverse().toString();
    }
}
