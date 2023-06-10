class Solution {
    public int maxValue(int n, int index, int maxSum) {
        long r= n-index-1,l = index;
        long high = maxSum,low = 1;
        long res = 0;
        while(low<=high){
            long mid = low +(high-low)/2;
            long sum =mid;
            long ls,rs;
            long m = mid-1;
             if(r<=m) rs = m*(m+1)/2 - (m-r)*(m-r+1)/2;
             else rs = m*(m+1)/2 + 1*(r-m);

             if(l<=m) ls = m*(m+1)/2 - (m-l)*(m-l+1)/2;
             else ls = m*(m+1)/2 + 1*(l-m);

             sum += ls+rs;

             if(sum <= maxSum){
                 res = mid;
                 low = mid+1;
             }
             else high = mid-1;
        }
        return (int)res;
    }
}
