class Solution {
    public int longestSubarray(int[] nums) {
      int ans =0,zero =0,start =0;
      for(int i =0;i<nums.length;i++){
          if(nums[i] == 0)zero++;
          while(zero > 1){
              if(nums[start] == 0)zero--;
              start++;
          }
          ans = Math.max(ans,i-start);
      }  
      return ans;
    }
}
