class Solution {
    int res;
    int[] parent,count;
    public int numberOfGoodPaths(int[] vals, int[][] edges) {
        Arrays.sort(edges,(a,b)-> Integer.compare(Math.max(vals[a[0]],vals[a[1]]),Math.max(vals[b[0]],vals[b[1]])));
        int n=vals.length;
        res=n;
        count=new int[n];
        parent=new int[n];
        Arrays.fill(count,1);

        for(int i=0;i<n;i++)parent[i]=i;
        for(int[] edge:edges){
            union(edge[0],edge[1],vals);
        }
        return res;
    }
    int find(int x){
        if(parent[x]==x) return x;
        return parent[x]=find(parent[x]);
    }
    void union(int x,int y,int[] vals){
        int parentX=find(x);
        int parentY=find(y);
      if(parentX==parentY) return;
      if(vals[parentX]==vals[parentY]){
       res+=count[parentX]*count[parentY];
       count[parentX]+=count[parentY];
       parent[parentY]=parentX;
      }
      else if(vals[parentX]>vals[parentY]){
          parent[parentY]=parentX;
      }
      else{
          parent[parentX]=parentY;
      }
    }
}
