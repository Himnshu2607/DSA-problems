class Solution {
    int ans=-1;
    void dfs(int curr,boolean[] visited,int[] edges,Map<Integer,Integer> map){
        visited[curr]=true;
        int padosi= edges[curr];
        if(padosi!=-1 && !visited[padosi]){
            map.put(padosi,map.get(curr)+1);
            dfs(padosi,visited,edges,map);
        }
        else if(padosi!=-1 && map.containsKey(padosi)){
           ans=Math.max(ans,map.get(curr)-map.get(padosi)+1);
        }
    }

    public int longestCycle(int[] edges) {
     int n=edges.length;
     boolean visited[] = new boolean[n];
     for(int i=0;i<n;i++){
         if(!visited[i]){
             Map<Integer,Integer> map = new HashMap<>();
             map.put(i,1);
             dfs(i,visited,edges,map);
         }
     }  
     return ans;
    }
    
}
