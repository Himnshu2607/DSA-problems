class Solution {
    List<String> ans = new ArrayList<>();
    public List<String> addOperators(String num, int target) {
        dfs(0,"",0,0,num,target);
        return ans;
    }
    void dfs(int i,String path,long res,long prev,String s,int target){
        if(i == s.length()){
            if(res == target) ans.add(path);
            return;
        }
        for(int j =i;j<s.length();j++){
            if(j > i && s.charAt(i) == '0') break;
            long curr = Long.parseLong(s.substring(i,j+1));
            if(i == 0) dfs(j+1,path+curr,curr,curr,s,target);
            else {
                dfs(j+1,path+ "+" +curr,res+curr,curr,s,target);
                dfs(j+1,path+ "-" +curr,res-curr,-curr,s,target);
                dfs(j+1,path+ "*" +curr,res-prev + prev *curr,prev *curr,s,target);
            }
        }
    }
}
