class Solution {
    public int bestTeamScore(int[] scores, int[] ages) {
    int prr[][] =new int[ages.length][2];
    for(int i=0;i<ages.length;i++){
        prr[i][0]=ages[i];
        prr[i][1]=scores[i];
    }
    Arrays.sort(prr,(a,b)->b[0]==a[0]?a[1]-b[1]:a[0]-b[0]);
    int ans[] =new int[ages.length];
    ans[0] = prr[0][1];
    int max=ans[0];
    for(int i=1;i<ages.length;i++){
        ans[i]=prr[i][1];
        for(int j=0;j<i;j++){
            if(prr[j][1]<=prr[i][1]){
                ans[i]=Math.max(ans[i],prr[i][1]+ans[j]);
            }
        }
      max=Math.max(ans[i],max);
    }
    return max;
}
}
