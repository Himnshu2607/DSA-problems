class Solution {
    public String simplifyPath(String path) {
       String token[] = path.split("/+");
       Stack<String> st = new Stack<>();
        for(String t : token){
            if(st.size() > 0 && ("..").equals(t)) st.pop();
            else if(!Arrays.asList("",".","..").contains(t)) st.push(t);
        }
        StringBuilder sb = new StringBuilder();
        for(String s : st) sb.append("/").append(s);

        return sb.length() == 0 ? "/" : sb.toString();
    }
}
