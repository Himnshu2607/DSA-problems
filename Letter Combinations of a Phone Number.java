class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if(digits.length() == 0) return ans;
        Map<Character,String> map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        solve(new StringBuilder(),0,ans,digits,map);
        return ans;
    }
    void solve(StringBuilder sb,int idx,List<String> ans,String digits,Map<Character,String> map){
        if(idx == digits.length()){
            ans.add(sb.toString());
            return;
        }
        String letter = map.get(digits.charAt(idx));
        for(char ch : letter.toCharArray()){
            sb.append(ch);
            solve(sb,idx+1,ans,digits,map);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
