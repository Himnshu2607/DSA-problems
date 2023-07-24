class Solution {
    public int partitionDisjoint(int[] nums) {
        int currMax = nums[0],max = nums[0],ans =1;
        for(int i=1;i<nums.length;i++){
            if(nums[i] < currMax){
                ans = i+1;
                currMax = max;
            }
            else max = Math.max(max,nums[i]);
        }
        return ans;
    }
}
