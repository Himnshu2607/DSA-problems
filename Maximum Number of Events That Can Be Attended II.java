class Solution {
    public int maxValue(int[][] events, int k) {
        int max = 0;
        if(k == 1){
            for(int event[] : events)
            max = Math.max(max,event[2]);
            return max;
        }
        Arrays.sort(events,(a,b) -> Integer.compare(a[0],b[0]));
        int n = events.length;
        int arr[][] = new int[n+1][k+1];

        for(int i =n-1;i>=0;i--){
            int next = bsearch(events,events[i][1],i+1,n);
            for(int j=1;j<=k;j++){
                arr[i][j] = Math.max(arr[i+1][j] , arr[next][j-1] + events[i][2]);
            }
        }
        return arr[0][k];
    }
    int bsearch(int events[][],int end,int low,int high){
        while(low < high){
            int mid = (low+high)/2;
            if(end >= events[mid][0]) low = mid+1;
            else high = mid;
        }
        return low;
    }
}
