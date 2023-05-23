class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
    Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
    int prev[] = intervals[0];
    int res = 0;
    for(int i = 1;i<intervals.length;i++){
        int curr[] = intervals[i];
        if(curr[0] < prev[1]){
            res++;
            if(prev[1] <= curr[1]) continue;
        }
        prev = curr;
    }
    return res;
    }
}
