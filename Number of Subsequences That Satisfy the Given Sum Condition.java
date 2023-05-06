class Solution {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int left = 0, right = n - 1;
        int res = 0,mod = 1000000007;
        int[] pows = new int[n];
        pows[0] = 1;
        for (int i = 1 ; i < nums.length ; ++i)
            pows[i] = pows[i - 1] * 2 % mod;
        while (left <= right) {
            if (nums[left] + nums[right] <= target) {
                res = (res + pows[right - left]) % mod;
                left++;
            } else {
                right--;
            }
        }
        return res;
    }
}
