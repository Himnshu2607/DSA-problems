class Solution {
    public int latestDayToCross(int row, int col, int[][] cells) {
        int left = 1,right = cells.length,ans =-1;
        while(left <= right){
            int mid = left+(right-left)/2;
            if(helper(row,col,cells,mid)){
                ans = mid;
                left = mid+1;
            }
            else right = mid -1;
        }
        return ans;
    }
    boolean helper(int row,int col,int[][] cells,int mid){
        int grid[][] = new int[row][col];
        for(int i =0;i< mid;i++){
            int r = cells[i][0] - 1;
            int c = cells[i][1] - 1;
            grid[r][c] = 1;
        }
        Set<Pair<Integer,Integer>> vis = new HashSet<>();
        Deque<Pair<Integer,Integer>> st = new ArrayDeque<>();
        for(int i = 0;i < col;i++){
            if(grid[0][i] ==0) st.push(new Pair<>(0,i));
        }
        while(!st.isEmpty()){
            Pair<Integer,Integer> curr = st.pop();
            int r = curr.getKey();
            int c = curr.getValue();
            if(r == row-1) return true;
            if(vis.contains(curr)) continue;
            vis.add(curr);
            int dir[][] = {{0,1},{1,0},{-1,0},{0,-1}};
            for(int d[] : dir){
                int nR = r +d[0];
                int nC = c + d[1];
                if(nR >=0 && nR < row && nC >= 0 && nC < col && grid[nR][nC] == 0) 
                st.push(new Pair<>(nR,nC));
            }
        }
        return false;
    }
}
