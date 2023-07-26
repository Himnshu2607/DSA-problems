class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        if(hour < dist.length -1) return -1;
        double d = 0.0;
        for(int x : dist) d +=x;
        int s = (int) Math.ceil(d/hour) -1;
        int l =1,r=10000000,min=-1;
        while(l<=r){
            int mid = (l+r) /2;
            d = mid;
            double t = 0.0;
            for(int i =0;i<dist.length;i++){
                if(i != dist.length -1) t += Math.ceil((double)dist[i] /d);
                else t+=(double) dist[i] /d;
            }
            if(t <= hour){
                min = mid;
                r = mid-1;
            }
            else l = mid+1;
        }
        return min;
    }
}
