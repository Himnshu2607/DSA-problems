class Solution {
    public int numRabbits(int[] answers) {
        int count =0;
        int countArr[] = new int[1000];
        boolean vis[] = new boolean[1000];
        for(int ans : answers){
            if(countArr[ans] == ans || vis[ans] == false){
                count += ans+1;
                countArr[ans] = 0;
                vis[ans] = true;
            }
            else{
                countArr[ans]++;
                vis[ans] = true;
            }
        }
        return count;
    }
}
