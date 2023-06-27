class Solution {
    public int minCostConnectPoints(int[][] points) {
        int n = points.length;
        int arr[] = new int[n];
        for(int i =1;i<n;i++) arr[i] = Integer.MAX_VALUE;
        boolean vis[] = new boolean[n];
        vis[0] = true;
        int edge =0,sum=0,curr=0;
        while(edge++ < n-1){
            int minEdge = Integer.MAX_VALUE;
            int next = -1;
            for(int i=0;i<n;i++){
                if(!vis[i]){
                    int dis = Math.abs(points[curr][0] -points[i][0]) + Math.abs(points[curr][1] - points[i][1]);
                    arr[i] = Math.min(arr[i],dis);
                    if(arr[i] < minEdge){
                        minEdge = arr[i];
                        next = i;
                    }
                }
            }
            curr = next;
            vis[curr] = true;
            sum += minEdge;
        }
        return sum;
    }
}
