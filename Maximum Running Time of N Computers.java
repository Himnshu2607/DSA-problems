class Solution {
    public long maxRunTime(int n, int[] batteries) {
        long sum =0;
        for(int b:batteries) sum+=b;
        long left=1,right=sum/n;
        while(left < right){
          long mid = right - (right-left)/2;
          long extra =0;
          for(int b : batteries) extra+=Math.min(b,mid);
          if(extra >= (long)n*mid) left = mid;
          else right = mid-1;
        }
        return left;
    }
}
