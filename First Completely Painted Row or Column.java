class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        Map<Integer,Integer> map = new HashMap<>();
        int len = arr.length;
        for(int i=0;i<len;i++) map.put(arr[i],i);
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<m;i++){
            int minIdx = Integer.MIN_VALUE;
            for(int j=0;j<n;j++){
                minIdx = Math.max(minIdx,map.get(mat[i][j]));
            }
            ans = Math.min(ans,minIdx);
        }
        for(int j=0;j<n;j++){
            int minIdx = Integer.MIN_VALUE;
            for(int i=0;i<m;i++){
                minIdx = Math.max(minIdx,map.get(mat[i][j]));
            }
            ans = Math.min(ans,minIdx);
        } 
        return ans;   
    }
}
