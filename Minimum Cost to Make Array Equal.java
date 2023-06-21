class Solution {
    public long minCost(int[] nums, int[] cost) {
     int l=0,r=1000000;
     while(l <= r){
         int mid = (l+r)/2;
         long t1= check(mid-1,nums,cost);
         long t2= check(mid,nums,cost);
         long t3= check(mid+1,nums,cost);
         if(t1 >= t2 && t3 >= t2) return t2;
         else if(t1 < t2) r = mid -1;
         else l = mid+1;
     }
     return 0;
    }
    long check(int mid,int[] nums,int[] cost){
        long sum = 0;
        for(int i=0;i<nums.length;i++){
            sum += 1l * Math.abs(mid - nums[i])*cost[i];
        }
        return sum;
    }
}
