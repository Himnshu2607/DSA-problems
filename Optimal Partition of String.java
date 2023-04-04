class Solution {
    public int partitionString(String s) {
        boolean arr[] =new boolean[26];
        Arrays.fill(arr,false);
        int count=1;
        int i=0;
        while(i<s.length()){
            int a=s.charAt(i)-'a';
            if(arr[a]==true){
                Arrays.fill(arr,false);
                count++;
            }
                arr[a]=true;
                i++;
        }
        return count;
   }
}
