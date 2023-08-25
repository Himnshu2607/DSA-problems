import java.util.*;
class Pair{
    int first,second;
    Pair(int x,int y){
        this.first = x;
        this.second = y;
    }
}
public class Solution {
    
    public static String cycleDetection(int[][] edges, int n, int m) {
        List<List<Integer>> adj = new ArrayList<>();
        boolean[] vis = new boolean[n+1];
        for(int i=0;i<n+1;i++){
            vis[i] = false;
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<m;i++){
            adj.get(edges[i][0]).add(Integer.valueOf(edges[i][1]));
            adj.get(edges[i][1]).add(Integer.valueOf(edges[i][0])); 
        }
        Queue<Pair> q = new LinkedList<>();
        for(int i=1;i<=n;i++){
            if(!vis[i]){
                q.add(new Pair(i,-1));
                while(!q.isEmpty()){
                    Pair temp = q.remove();
                    if(!vis[temp.first]){
                        vis[temp.first] = true;
                        for(int j : adj.get(temp.first)){
                            if(!vis[j]) q.add(new Pair(j,temp.first));
                        }
                    }
                    else return "Yes";
                }
            }
        }
        return "No";
    }
}
