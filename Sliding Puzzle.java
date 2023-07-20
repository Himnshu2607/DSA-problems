class Solution {
    public int slidingPuzzle(int[][] board) {
        String target = "123450";
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                sb.append(board[i][j]);
            }
        }
            String str = sb.toString();
            Queue<String> q = new ArrayDeque<>();
            Set<String> vis = new HashSet<>();
            int swap[][] = {{1,3},{0,2,4},{1,5},{0,4},{1,3,5},{2,4}};
            int lvl =0;
            vis.add(str);
            q.add(str);
            while(!q.isEmpty()){
              int size = q.size();
              while(size-- >0){
                  String temp = q.poll();
                  if(temp.equals(target))return lvl;
                  int index = temp.indexOf('0');
                  for(int swapIndex : swap[index]){
                      StringBuilder s = new StringBuilder(temp);
                      s.setCharAt(index,temp.charAt(swapIndex));
                      s.setCharAt(swapIndex,'0');
                      String puzz = s.toString();
                      if(vis.contains(puzz) == true) continue;
                      vis.add(puzz);
                      q.add(puzz);
                  }
              }  
              lvl +=1;
            }
        return -1;
    }
}
