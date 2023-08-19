class Solution
{
    //Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
    static int findPlatform(int arr[], int dep[], int n)
    {
        Arrays.sort(arr);
        Arrays.sort(dep);
        int need=1,ans=1,i=1,j=0;
        while(i<n && j<n){
            if(arr[i] <= dep[j]){
                need++;i++;
            }
            else if(arr[i] > dep[j]){ 
                need--;j++;
            }
            if(need > ans) ans = need;
        }
        return ans;
    }
}
