class Solution {
    int dp[][]= new int[501][501];
    public int minInsertions(String s) {
       for(int i=0;i<500;i++){
           for(int j=0;j<500;j++) dp[i][j]=-1;  
       }
       int n=s.length();
       return madad(s,0,n-1);
    }
    int madad(String s,int st,int end){
        if(st==end || st>end) return dp[st][end] =0;
        if(dp[st][end]!=-1) return dp[st][end];
        if(s.charAt(st) == s.charAt(end)) return dp[st][end] = madad(s,st+1,end-1);
        else{
            int a = madad(s,st+1,end)+1;
            int b = madad(s,st,end-1)+1;
            return dp[st][end] = Math.min(a,b);
       }
    }
}
