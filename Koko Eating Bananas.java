class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=Integer.MIN_VALUE;
        for(int p:piles) high=Math.max(high,p);
        while(low<high){
            int mid=low+(high-low)/2;
            int k=0;
            for(int p: piles) k+=Math.ceil((double)p/mid);
            if(k<=h) high=mid;
            else low=mid+1;
        }
        return high;
    }
}
