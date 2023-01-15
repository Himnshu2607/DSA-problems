class Solution {
    public int integerReplacement(int n) {
        int ans=0;
        while(n>1){
            if(n==2147483647) return 32;
            if(n==3) return ans+2;
            if(n%2==0) n=n/2;
            else{
                if(((n+1)/2)%2==0) n++;
                else
                n--;
            }
            ans++;
        }
        return ans;
    }
    }
