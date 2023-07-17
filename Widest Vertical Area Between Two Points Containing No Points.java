class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int ans = 0;
        int x[] = new int[points.length];
        for(int i=0;i<points.length;i++) x[i] = points[i][0];
        Arrays.sort(x);
        for(int i=x.length-1;i>0;i--) ans = Math.max(ans,x[i] - x[i-1]);
        return ans;
    }
}
