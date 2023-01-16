class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
       List<int[]> ans=new ArrayList<>();
        int[] temp=newInterval;
        for(int i=0;i<intervals.length;i++){
            if(intervals[i][0]>temp[1]){
                ans.add(temp);
                temp=intervals[i];
            }
            else if(intervals[i][1]>=temp[0])
            temp=new int[]{Math.min(intervals[i][0],temp[0]),Math.max(intervals[i][1],temp[1])};
            else
            ans.add(intervals[i]);
        }
        ans.add(temp);
        return ans.toArray(new int[ans.size()][2]);
        
    }
}
