class Solution {
    public int numberOfBeams(String[] bank) {
        int freq1 =0,ans=0;
        for(String b : bank){
            int freq2 = 0;
            for(char c:b.toCharArray()){
                if(c =='1') freq2++;
            }
            if(freq2 >0){
                ans += freq1 * freq2;
                freq1 = freq2;
            }
        }
        return ans;
    }
}
