class Solution {
    public long maxScore(int[] nums, int x) {
        long ans=0,even=0,odd=0;
        if(nums[0]%2 == 0){
            even+=nums[0];
            odd+=nums[0] -x;
        }
        else{
            even+=nums[0]-x;
            odd+=nums[0]; 
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i]%2 ==0) even = Math.max(even+nums[i],odd-x+nums[i]);
            else odd = Math.max(odd+nums[i],even-x+nums[i]);
            ans = Math.max(odd,even);
        }
        return ans;
    }
}
