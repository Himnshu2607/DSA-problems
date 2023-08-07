class Solution {
    public int minAddToMakeValid(String s) {
        int i =0;
       Stack<Character> st = new Stack<>(); 
       while(i < s.length()){
           if(s.charAt(i) == ')'){
               if(!st.isEmpty() && st.peek() == '(')st.pop();
               else st.push(s.charAt(i));
           }
           else st.push(s.charAt(i));
           i++;
       }
       return st.size();
    }
}
