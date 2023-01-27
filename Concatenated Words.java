class Solution {
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        Set<String> s=new HashSet<>();
        List<String> ans=new ArrayList<>();
        for(String word:words)
        s.add(word);

        for(String word:words){
         if(concatenate(word,s)==true)
         ans.add(word);
        }
        return ans;

    }
    boolean concatenate(String word,Set<String> s){
        for(int i=1;i<word.length();i++){
            String preword = word.substring(0,i);
            String suffword = word.substring(i,word.length());
           if(s.contains(preword) && (s.contains(suffword) || concatenate(suffword,s))) return true; 
        }
    return false;
    }
}
