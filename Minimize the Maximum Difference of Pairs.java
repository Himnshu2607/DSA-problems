class Solution {
    public int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);
        int start = 0;
        int end = nums[nums.length-1]-nums[0];
        int ans = end;
        while(start <= end){
            int mid = (start+end) /2;
            if(helper(nums,p,mid)){
                ans = mid;
                end = mid-1;
            }
            else start = mid+1;
        }
        return ans;
    }
    boolean helper(int nums[],int p,int diff){
        for(int i=1;i<nums.length;i++){
            if(nums[i] - nums[i-1] <= diff){
                p--;i++;
            }
        }
        return p<=0;
    }
}
