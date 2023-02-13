class Solution {
    public int countOdds(int low, int high) {
       int half=(high-low)/2;int ans=0;
       if(low%2==0 && high%2==0) ans=half;
       else
       ans=half+1;
       return ans; 
    }
}
