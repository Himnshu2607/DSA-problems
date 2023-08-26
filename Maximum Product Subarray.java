class Solution {
    public int maxProduct(int[] nums) {
        int ans = nums[0];
        int max = ans,min=ans;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<0){
                int temp = max;
                max = min;
                min = temp;
            }
            max = Math.max(max*nums[i],nums[i]);
            min = Math.min(min*nums[i],nums[i]);
            ans = Math.max(max,ans);
        }
        return ans;
    }
}
