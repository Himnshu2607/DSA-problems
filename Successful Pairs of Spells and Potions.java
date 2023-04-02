class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n=spells.length,m=potions.length;
        Arrays.sort(potions);
        int ans[] =new int[spells.length];
        for(int i=0;i<n;i++){
            int start=0;
            int end=m-1;
            while(start<=end){
                int mid=start+(end-start)/2;
                long prod= (long) spells[i]*potions[mid];
                if(prod>=success) end=mid-1;
                else start=mid+1;
            }
            ans[i]=m-start;
        }
        return ans;
    }
}
