lass Solution {
    public boolean escapeGhosts(int[][] ghosts, int[] target) {
        int dist = Math.abs(target[0])+Math.abs(target[1]);
        for(int i=0;i<ghosts.length;i++){
            int ghost = Math.abs(target[0]-ghosts[i][0]) + Math.abs(target[1]-ghosts[i][1]);
            if(ghost <= dist) return false;
        }
        return true;
    }
}
