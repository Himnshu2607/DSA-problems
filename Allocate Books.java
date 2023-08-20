import java.util.* ;
import java.io.*; 
public class Solution {
    public static long ayushGivesNinjatest(int n, int m, int[] time) {
        long sum =0;
        int maxTime = Integer.MIN_VALUE;
        for(int i = 0;i<m;i++){
            sum += time[i];
            maxTime = Math.max(maxTime,time[i]);
        }
        long l = maxTime,r = sum,ans = sum;
        while(l<=r){
            long mid = (l+r)/2;
            long days = 1,curr = 0;
            for(int i=0;i<m;i++){
                curr += time[i];
                if(curr > mid){
                    days++;
                    curr = time[i];
                }
            }
            if(days <= n){
                ans = mid;
                r = mid-1;
            }
            else l = mid+1; 
        }
        return ans;
    }
}
