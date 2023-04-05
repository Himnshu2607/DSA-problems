class Solution {
    public int minimizeArrayValue(int[] nums) {
        int ans=0;
        long total=0;
        for(int i=0;i<nums.length;i++){
         total=total+nums[i];
         double avg = (double) total/(i+1); 
         int c=(int) Math.ceil(avg);
         ans=Math.max(ans,c);  
        }
        return ans;
    }
}
