class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int num[] = nums.clone();
        Arrays.sort(num);
        int s = nums.length,e = 0;
        for(int i =0;i<nums.length;i++){
            if(num[i] != nums[i]){
                s = Math.min(s,i);
                e = Math.max(e,i);
            }
        }
        return e - s > 0 ? e-s+1 : 0;
    }
}
