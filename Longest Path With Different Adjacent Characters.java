class Solution {
    int ans=1;
    public int longestPath(int[] parent, String s) {
        int n = parent.length;
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());
        for (int i = 1; i < n; i++) adj.get(parent[i]).add(i);
   
         dfs(0,s,adj);
         return ans;
    }
    int dfs(int currNode,String s,List<List<Integer>> adj){
        int currMax=0,secMax=0;
        for(int nextNode: adj.get(currNode)){
            int res=dfs(nextNode,s,adj);
            if(s.charAt(currNode)==s.charAt(nextNode)) continue;
            if(res>currMax){
                secMax=currMax;
                currMax=res;
            }
            else if(res>secMax)secMax=res;
        }
        ans=Math.max(ans,currMax+secMax+1);
        return 1+currMax;
    }
}
