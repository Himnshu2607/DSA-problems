class Solution {
    public int numberOfGoodSubarraySplits(int[] nums) {
        long mod = 1000000007;
        long ans=1,count=0;
        boolean flag = false;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1){
                flag = true;
                ans = (ans*(count+1)) %mod;
                count = 0;
            }
            if(nums[i] == 0 && flag == true) count++;  
        }
        if(flag == false) return 0;
        return (int)(ans % mod);
    }
}
