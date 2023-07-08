class Solution {
    public long putMarbles(int[] weights, int k) {
        int n = weights.length;
        int pairsum[] = new int[n-1];
        for(int i =0;i<n-1;i++) pairsum[i] = weights[i]+weights[i+1];
        Arrays.sort(pairsum);
        long max=0,min=0;
        for(int i=0;i<k-1;i++){
            max += pairsum[n-i-2];
            min += pairsum[i];
        }
        return max - min;
    }
}
