class Solution {
    int ans = Integer.MAX_VALUE;
    public int distributeCookies(int[] cookies, int k) {
        solve(cookies,0,k,new int[k]);
        return ans;
    }
    void solve(int[] cookies,int i,int k,int[] curr){
        if(i == cookies.length){
            int max = 0;
            for(int c : curr)
            max = Math.max(max,c);
            ans = Math.min(ans,max);
            return;
        }
        for(int j=0;j<k;j++){
            curr[j] += cookies[i];
            solve(cookies,i+1,k,curr);
            curr[j] -= cookies[i];
        }
    }
}
