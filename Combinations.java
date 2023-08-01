class Solution {
    public List<List<Integer>> combine(int n, int k) {
      List<List<Integer>> ans = new ArrayList<>();
      List<Integer> temp = new ArrayList<>();
      generate(1,n,k,ans,temp);
      return ans;  
    }
    void generate(int start,int n,int k,List<List<Integer>> ans,List<Integer> temp){
        if(temp.size() == k){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=start;i<=n;i++){
            temp.add(i);
            generate(i+1,n,k,ans,temp);
            temp.remove(temp.size()-1);
        }
    }
}
