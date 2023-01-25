class Solution {
    public int closestMeetingNode(int[] edges, int node1, int node2) {
        int ans=-1,distance=Integer.MAX_VALUE;
        int n=edges.length;
        int path1[]=new int[n];
        Arrays.fill(path1,-1);
        int path2[]=new int[n];
        Arrays.fill(path2,-1);
        path(node1,0,edges,path1);
        path(node2,0,edges,path2);

        for(int i=0;i<n;i++){
            if(Math.min(path1[i],path2[i])>=0 && Math.max(path1[i],path2[i])<distance){
                distance=Math.max(path1[i],path2[i]);
                ans=i;
            }
        }
        return ans;
    }
    void path(int i,int curr,int[] edge,int[] path){
        if(i!=-1 && path[i]==-1){
            path[i]=curr;
            path(edge[i],curr+1,edge,path);
        }
    }
}
