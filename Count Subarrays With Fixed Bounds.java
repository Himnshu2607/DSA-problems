class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
       long ans=0;
       int start=0,minStart=0,maxStart=0;
       boolean minf=false,maxf=false;
       for(int i=0;i<nums.length;i++){
           int num=nums[i];
           if(num<minK || num>maxK){
               minf=false;
               maxf=false;
               start=i+1;
           }
           if(num==minK){
               minf=true;
               minStart=i;
           }
           if(num==maxK){
               maxf=true;
              maxStart=i;
           }
           if(minf && maxf) ans+=Math.min(minStart,maxStart)-start+1;
       }
       return ans;
    }
}
