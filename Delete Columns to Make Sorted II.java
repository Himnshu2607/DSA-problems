class Solution {
    public int minDeletionSize(String[] strs) {
        int m=strs.length,n=strs[0].length(),i,j,res =0;
        boolean sorted[] = new boolean[m];
        for(i=0;i<n;i++){
            for(j=0;j<m-1;j++){
                if(!sorted[j] &&(strs[j].charAt(i) > strs[j+1].charAt(i))){
                    res++;
                    break;
                }
            }
            if(j == m-1){
                for(int k=0;k<m-1;k++) sorted[k] |= strs[k].charAt(i) < strs[k+1].charAt(i);
            }
        }
        return res;
    }
}
