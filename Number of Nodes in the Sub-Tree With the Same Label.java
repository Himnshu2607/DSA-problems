class Solution {
    boolean visited[];
    int ans[];
    List<List<Integer>> adj;
    public int[] countSubTrees(int n, int[][] edges, String labels) {
       adj =new ArrayList<>(n);
       ans=new int[n];
        for(int i=0;i<n;i++)adj.add(new ArrayList<>());
        for(int edge[]: edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
      visited=new boolean[n];
         dfs(0,labels);
         return ans;
    }
    int[] dfs(int root,String labels){
        visited[root]=true;
        int[] count=new int[26];
        for(int temp:adj.get(root)){
            if(!visited[temp]){
            int[] add=dfs(temp,labels);
            for(int i=0;i<26;i++) count[i]+=add[i];
            }
        }
        char ch=labels.charAt(root);
        count[ch-'a']++;
        ans[root]=count[ch-'a'];
        return count;
    }
}
