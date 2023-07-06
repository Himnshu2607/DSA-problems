class Solution {
    public int numberOfWeakCharacters(int[][] properties) {
       Arrays.sort(properties,(a,b) -> a[0] == b[0] ? a[1]-b[1] : b[0] - a[0]);
       int ans=0,max=0;
       for(int a[] : properties){
           if(a[1] < max)ans++;
           max = Math.max(a[1],max);
       } 
       return ans;
    }
}
