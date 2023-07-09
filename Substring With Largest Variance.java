class Solution {
    public int largestVariance(String s) {
        int[] counter = new int[26];
        for(char ch : s.toCharArray()) counter[ch -'a']++;
        int max=0;
        for(int i=0;i<26;i++){
            for(int j=0;j<26;j++){
               if(i==j || counter[i]==0 || counter[j]==0) continue;
               char ma = (char)('a'+i);
               char mi = (char)('a'+j);
               int macount=0,micount=0,restminor=counter[j];
               for(char ch : s.toCharArray()){
                   if(ch == ma) macount++;
                   if(ch == mi) {
                       micount++;
                       restminor--;
                   }
                   if(micount >0) max = Math.max(max,macount-micount);
                   if(macount < micount && restminor >0){
                       micount = 0;
                       macount = 0;
                   }
               }
            }
        }
        return max;
    }
}
