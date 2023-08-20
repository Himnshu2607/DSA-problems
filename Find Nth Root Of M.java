public class Solution {
    public static int NthRoot(int n, int m) {
        int l =0,r=m;
        while(l<=r){
            int mid = (l+r)/2;
            int ans = solve(mid,n,m);
            if(ans == 1) return mid;
            else if(ans == 2)r = mid-1;
            else l = mid+1;
        }
        return -1;
    }
    static int solve(int mid,int n,int m){
        long ans =1;
        for(int i=1;i<=n;i++){
            ans *= mid;
            if(ans == m) return 1;
            if(ans > m) return 2;
        }
        return 0;
    }
}
