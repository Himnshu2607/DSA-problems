class Solution 
{
    public static int maxMeetings(int start[], int end[], int n)
    {
        int meeting[][] = new int[n][2];
        for(int i=0;i<n;i++){
            meeting[i][0] = start[i];
            meeting[i][1] = end[i];
        }
        
        Arrays.sort(meeting,(a,b) -> a[1] - b[1]);
        int limit = meeting[0][1];
        int count =1;
        for(int i=1;i<n;i++){
            if(meeting[i][0] > limit){
                limit = meeting[i][1];
                count++;
            }
        }
        return count;
    }
}
