class Solution {
    public List<Integer> splitIntoFibonacci(String num) {
       List<Integer> res = new ArrayList<>();
       helper(num,res,0);
       return res; 
    }
    boolean helper(String s,List<Integer> res,int ind){
        if(s.length() == ind) return res.size()>2;
        int num =0;
        for(int i=ind;i<s.length();i++){
            num = num*10 +(s.charAt(i) -'0');
            if(num <0) return false;
            if(res.size()<2 || res.get(res.size()-1)+res.get(res.size()-2) == num){
                res.add(num);
                if(helper(s,res,i+1)) return true;
                res.remove(res.size()-1);
            }
            if(i == ind && s.charAt(i) == '0') return false;
        }
        return false;
    }
}
