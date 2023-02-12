class Solution {
    long ans=0;
    public long minimumFuelCost(int[][] roads, int seats) {
    List<List<Integer>> li=new ArrayList<>();
    for(int i=0;i<roads.length+1;i++) li.add(new ArrayList<>());
      for(int[] r:roads){
          int u=r[0];
          int v=r[1];
          li.get(u).add(v);
          li.get(v).add(u);
      }  
      dfs(0,0,li,seats);
      return ans;
    }
    int dfs(int i,int prev,List<List<Integer>> li,int seats){
        int people=1;
        for(int x :li.get(i)){
            if(x==prev) continue;
            people+=dfs(x,i,li,seats);
        }
        if(i!=0) ans+=(people +seats-1)/seats;
        return people;
    }
}
