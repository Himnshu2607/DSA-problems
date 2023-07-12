class Solution {
    public char[][] rotateTheBox(char[][] box) {
        int r=box.length,c=box[0].length;
        char[][] temp = new char[c][r];
        for(int i=0;i<r;i++){
            int blank = c-1;
            for(int j=c-1;j>=0;j--){
                if(box[i][j] == '*') blank = j-1;
                if(box[i][j] == '#'){
                    box[i][j] ='.';
                    box[i][blank] = '#';
                    blank--;
                }
            }
        }
        for(int i=0;i<r;i++)
            for(int j=c-1;j>=0;j--)
                temp[j][r-i-1] = box[i][j];
        return temp;
    }
}
