class Solution {
    public int sumOfBeauties(int[] nums) {
        int n =nums.length;
        int pre[] = new int[n],suff[] = new int [n];
        int curr = nums[0],ans =0;
        for(int i=0;i<n;i++){
            curr = Math.max(curr,nums[i]); pre[i] = curr;
        }
         curr = nums[n-1];
        for(int i=n-1;i>=0;i--){
            curr = Math.min(curr,nums[i]); suff[i] = curr;
        }
        for(int i=1;i<n-1;i++){
            if(nums[i] > pre[i-1] && nums[i] < suff[i+1]) ans +=2;
            else if(nums[i] > nums[i-1] && nums[i] < nums[i+1]) ans++;
        }
        return ans;
    }
}
