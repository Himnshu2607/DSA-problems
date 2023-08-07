class Solution {
    int count(int n){
        int count =0;
        while(n >0){
            count++;
            n &= n-1;
        }
        return count;
    }

    int mostSetNumber(int n){
        if(n == 0) return 0;
        int msb =0;
        n /= 2;
        while(n != 0){
            n /= 2;
            msb++;
        }
        return (1 << msb);
    }
    public int minimizeXor(int num1, int num2) {
        int ans =0;
        int ct1 = count(num1);
        int ct2 = count(num2);
        if(ct1 <= ct2){
            int temp = num1;
            int diff = ct2 - ct1;
            ans = num1;
            int two =1;
            while(temp >0 && diff>0){
                if(temp %2 ==0){
                    ans +=two;
                    diff--;
                }
                temp >>= 1;
                two <<= 1;
            }
                while(diff > 0){
                    ans += two;
                    diff--;
                    two <<= 1;
                }
                return ans;
        }
            ans = 0;
            while(ct2 > 0){
                int x = mostSetNumber(num1);
                ans += x;
                ct2--;
                num1 &= (x-1);
            }
            return ans;
    }
}
