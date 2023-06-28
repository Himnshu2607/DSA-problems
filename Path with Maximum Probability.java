class Solution {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
        double maxProb[] = new double[n];
        maxProb[start] = 1.0;

        for(int i = 0;i<n-1;i++){
            boolean vis = false;
            for(int j = 0;j<edges.length;j++){
                int u = edges[j][0];
                int v = edges[j][1];
                double prob = succProb[j];
                if(maxProb[u] * prob > maxProb[v]){
                    maxProb[v] = maxProb[u] * prob;
                    vis = true;
                }
                if(maxProb[v] * prob > maxProb[u]){
                    maxProb[u] = maxProb[v] * prob;
                    vis = true;
                }
            }
            if(!vis) break;
        }
        return maxProb[end];
    }
}
