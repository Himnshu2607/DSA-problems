class Solution {
    public String simplifyPath(String path) {
       String token[] = path.split("/");
       Stack<String> st = new Stack<>();
       for(int i = 0 ; i<token.length ; i++){
           if(token[i].isEmpty()) continue;
       
           if(token[i].equals("..") && !st.isEmpty()) st.pop();
           else if(!token[i].equals("..") && !token[i].equals(".")) st.push(token[i]);
       }
       if(st.isEmpty()) return "/";

       StringBuilder sb = new StringBuilder();
       while(!st.isEmpty()) sb.insert(0,st.pop()).insert(0,"/");

       return sb.toString();
    }
}
