class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int l=0,r=nums.length-1,max=0,sum=0;
        while(l<r){
            sum = nums[l] + nums[r];
            l++;r--;
            max = Math.max(sum,max);
        }
        return max;
    }
}
