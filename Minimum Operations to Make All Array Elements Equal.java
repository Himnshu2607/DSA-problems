class Solution {
    public List<Long> minOperations(int[] nums, int[] queries) {
        List<Long> ans = new ArrayList<>();
        int n = nums.length;
        long[] rec = new long[n];
        Arrays.sort(nums);
        rec[0] = nums[0];
        for(int i=1;i<n;i++) rec[i] = rec[i-1]+nums[i];
        for(int i=0;i<queries.length;i++){
            long count =0;
            int temp = search(nums,queries[i]);
            if(temp == -1) temp =0;
            count += Math.abs(rec[temp] - (long)queries[i] * (temp+1));
            count += Math.abs(rec[n-1] - rec[temp] - (long)queries[i] * (n - temp-1));
            ans.add(count);
        }
        return ans;
    }
    int search(int[] nums,int target){
        int l=0,r=nums.length-1;
        while(l<=r){
            int mid = (l+r)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid]<target) l = mid+1;
            else r = mid-1;
        }
        return r;
    }
}
