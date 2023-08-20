import java.util.*;
public class Solution {
    public static int aggressiveCows(int []stalls, int k) {
        Arrays.sort(stalls);
        int l = 0,r= stalls[stalls.length -1] - stalls[0];
        int res =0;
        while(l<=r){
            int mid =(l+r)/2;
            if(binary(stalls,mid,k)){
                res = mid;
                l = mid+1;
            }
            else r = mid-1;
        }
        return res;
    }
    static boolean binary(int stalls[],int mid,int k){
        int coww =1,lastStall = stalls[0];
        for(int i=1;i<stalls.length;i++){
            if(stalls[i] -lastStall >= mid){
                lastStall = stalls[i];
                coww++;
                if(coww >= k) return true;
            }
        }
        return false;
    }
}
