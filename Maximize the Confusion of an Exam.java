class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int ans =0,i=0,l=0,count=0;
        String s = String.valueOf(answerKey);
        while(i < s.length()){
            if(s.charAt(i) == 'T') count++;
            while(count >k){
                if(s.charAt(l) == 'T') count--;
                l++;
            }
            ans = Math.max(ans,i-l+1);
            i++;
        }
        i=0;l=0;count=0;
        while(i < s.length()){
            if(s.charAt(i) == 'F') count++;
            while(count >k){
                if(s.charAt(l) == 'F') count--;
                l++;
            }
            ans = Math.max(ans,i-l+1);
            i++;
        }
        return ans;
    }
}
