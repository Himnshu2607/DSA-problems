class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        int res[] = new int[3];
        for(int e[] : triplets)
        if(e[0] <= target[0] && e[1] <= target[1] && e[2] <= target[2])
        res = new int[]{Math.max(res[0],e[0]),Math.max(res[1],e[1]),Math.max(res[2],e[2])};
        return Arrays.equals(target,res);
    }
}
