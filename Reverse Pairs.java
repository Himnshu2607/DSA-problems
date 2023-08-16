class Solution {
    public int reversePairs(int[] nums) {
        return mergeSort(0,nums,nums.length-1);
    }
    int mergeSort(int start,int[] nums,int end){
        if(start < end){
            int mid = (start+end)/2;
            return mergeSort(start,nums,mid)+ mergeSort(mid+1,nums,end)+merge(start,mid,end,nums);
        }
        return 0;
    }
    int merge(int start,int mid,int end,int[] nums){
        int first = start;
        int second = mid + 1;
        int[] sorted = new int[end - start + 1];
        int count = 0;
        while(first <= mid && second <= end) {
            if((long)nums[first] > (2 * (long) nums[second])) {
                count += mid - first + 1;
                second++;
            } else {
                first++;
            }
        }
        first = start;
        second = mid + 1;
        int index = 0;
        while(first <= mid && second <= end) {
            if(nums[first] < nums[second]) {
                sorted[index++] = nums[first++];
            } else {
                sorted[index++] = nums[second++];
            }
        }
        while (first <= mid) {
            sorted[index++] = nums[first++];
        }
        while (second <= end) {
            sorted[index++] = nums[second++];
        }
        index = 0;
        for (int i = start; i <= end; i++) {
            nums[i] = sorted[index++];
        }
        return count;
    }
}
