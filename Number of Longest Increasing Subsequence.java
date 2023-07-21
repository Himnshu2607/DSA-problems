class Solution {
    public int findNumberOfLIS(int[] nums) {
        int n = nums.length;
        int len[] = new int[n];
        int count[] = new int[n];
        Arrays.fill(len,1);
        Arrays.fill(count,1);
        int maxl = Integer.MIN_VALUE;
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[i] > nums[j]){
                    if(len[j] +1 > len[i]){
                        len[i] = len[j]+1;
                        count[i]= 0;
                    }
                    if(len[j]+1 == len[i]) count[i] += count[j];
                }
            }
        }
        int res= 0;
        for(int l : len) maxl = Math.max(maxl,l);
        for(int i=0;i<n;i++){
            if(len[i] == maxl) res +=count[i];
        }
        return res;
    }
}
