class job{
    int deadline,profit;
    job(int y,int z){
        this.deadline = y;
        this.profit = z;
    }
}
class Solution
{
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
       Arrays.sort(arr,(a,b) -> (b.profit - a.profit)); 
       int max = 0;
       for(int i=0;i<n;i++){
           if(arr[i].deadline > max) max = arr[i].deadline;
       }
       int res[] = new int[max+1];
       for(int i=1;i<=max;i++) res[i] = -1;
       int jobs=0,profit=0;
       for(int i=0;i<n;i++){
           for(int j=arr[i].deadline;j>0;j--){
               if(res[j] == -1){
                   res[j] = i;
                   jobs++;
                   profit += arr[i].profit;
                   break;
               }
           }
       }
       int ans[] = new int[2];
       ans[0] = jobs;
       ans[1] = profit;
       return ans;
    }
}
