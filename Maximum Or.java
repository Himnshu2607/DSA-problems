class Solution {
    public long maximumOr(int[] nums, int k) {
        int n = nums.length;
        long ans =0;
        long pre[] = new long[n];
        long suff[] = new long[n];
        for(int i = 1;i<n;i++) pre[i] = pre[i-1] | nums[i-1];
        for(int i =n-2;i>=0;i--) suff[i] = suff[i+1] | nums[i+1];
        for(int i=0;i<n;i++) ans = Math.max(ans,pre[i] | (long) nums[i] << k | suff[i]);
        return ans;
    }
}
