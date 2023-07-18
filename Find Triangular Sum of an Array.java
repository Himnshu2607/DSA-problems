class Solution {
    public int triangularSum(int[] nums) {
       int n= nums.length;
        for(int i=n;i>=0;i--){
            for(int j=1;j<n;j++){
                nums[j-1]=(nums[j-1]+nums[j])%10;
            }
            n--;
        }
        return nums[0]%10;
    }
}
