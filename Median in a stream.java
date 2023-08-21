import java.util.*;
public class Solution {
    public static int[] findMedian(int[] arr, int n) {
        ArrayList<Integer> li =new ArrayList<>();
        int medians[] = new int[n];
        for(int i=0;i<n;i++){
            li.add(arr[i]);
            Collections.sort(li);
            int median =0;
            if((i+1)%2 ==0) median = (li.get(i/2) +li.get((i+1)/2))/2;
            else median = li.get(i/2);
            medians[i] = median;
        }
        return medians;
    }
}
