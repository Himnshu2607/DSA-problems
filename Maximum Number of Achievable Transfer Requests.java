class Solution {
    int ans=0;
    void help(int i,int[][] requests,int l,int[] temp){
        if(i==requests.length){
            for(int t: temp) if(t!=0) return;
            ans = Math.max(ans,l);
        return;
        }
        help(i+1,requests,l,temp);
        temp[requests[i][0]]--;
        temp[requests[i][1]]++;
        help(i+1,requests,l+1,temp);
        temp[requests[i][0]]++;
        temp[requests[i][1]]--;
    }
    public int maximumRequests(int n, int[][] requests) {
        int temp[]= new int[n];
        Arrays.fill(temp,0);
        help(0,requests,0,temp);
        return ans;
    }
}
