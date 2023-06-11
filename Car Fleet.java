class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        float time[] = new float[target+1],max = 0;
        for(int i=0;i<position.length;i++)
            time[position[i]] = (float) (target -position[i]) /speed[i];

        int count=0;
        for(int i=target;i>=0;i--){
            if(time[i]>max){
                max=time[i];
                count++;
            }
        }
        return count;
   }
}
