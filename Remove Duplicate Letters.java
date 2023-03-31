class Solution {
    public String removeDuplicateLetters(String s) {
        int res[] = new int[26];
        boolean visited[] = new boolean[26];
        char ch[] = s.toCharArray();
        for(char c : ch) res[c -'a']++;

        Stack<Character> st =new Stack<>();
        int index;
        for(char sr : ch){
        index = sr-'a'; 
        res[index]--;
        if(visited[index]) continue;

        while(!st.isEmpty() && sr<st.peek() && res[st.peek()-'a']!=0)
            visited[st.pop()-'a'] = false;
        
        st.push(sr);
        visited[index]=true;
        } 
         StringBuilder sb = new StringBuilder();
         while(!st.isEmpty()) sb.insert(0,st.pop());
         return sb.toString();
  }
}
