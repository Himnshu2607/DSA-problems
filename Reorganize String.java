class Solution {
    public String reorganizeString(String s) {
        int hash[] = new int[26];
        for(int i=0;i<s.length();i++) hash[s.charAt(i) -'a']++;
        int max = 0,letters=0;
        for(int i=0;i<hash.length;i++){
            if(hash[i] > max){
                max = hash[i];
                letters = i;
            }
        }
        if(max > (s.length()+1) /2) return "";
        char[] ch = new char[s.length()];
        int idx =0;
        while(hash[letters]-- >0){
            ch[idx] = (char)(letters +'a');
            idx += 2;
        }
        for(int i =0;i<hash.length;i++){
            while(hash[i]-- > 0){
                if(idx >= ch.length) idx =1;
                ch[idx] = (char) (i+'a');
                idx += 2;
            }
        }
        return String.valueOf(ch);
    }
}
