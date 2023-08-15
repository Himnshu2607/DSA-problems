class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] ='.';
            }
        }
        int upperCol[] = new int[n];
        int leftDiagonal[] = new int[2*n-1];
        int rightDiagonal[] = new int[2*n-1];
        solve(0,n,board,upperCol,leftDiagonal,rightDiagonal,ans);
        return ans;
    }
    List<String> helper(char[][] board){
        List<String> temp = new ArrayList<>();
        for(int i=0;i<board.length;i++){
            String str = new String(board[i]);
            temp.add(str);
        }
        return temp;
    }
    void solve(int col,int n,char[][] board,int upperCol[],int leftDiagonal[],int rightDiagonal[],List<List<String>> ans){
        if(col == n){
            ans.add(helper(board));
            return;
        }
        for(int row=0;row<n;row++){
            if(upperCol[row] == 0 && leftDiagonal[row+col] == 0 && rightDiagonal[(n-1) + row-col] == 0){
                board[row][col] ='Q';
                upperCol[row] = 1;
                leftDiagonal[row+col] = 1;
                rightDiagonal[(n-1) + row- col] = 1;
                solve(col+1,n,board,upperCol,leftDiagonal,rightDiagonal,ans);
                board[row][col] = '.';
                upperCol[row] = 0;
                leftDiagonal[row+col] = 0;
                rightDiagonal[(n-1) + row- col] = 0;
           }
        }
    }
}
