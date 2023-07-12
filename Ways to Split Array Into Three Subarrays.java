class Solution {
    public int waysToSplit(int[] nums) {
        int n=nums.length;
        int mod = 1000000007;
        int ans=0;
        int arr[] = nums.clone();
        for(int i=1;i<n;i++) arr[i] += arr[i-1];
        for(int i=0;i<n-2;i++){
            int j = greaterEqual(arr,i);
            if(j == n-1) break;
            int mid = arr[j] - arr[i];
            int right = arr[arr.length-1] - arr[j];
            if(mid > right) continue;
            int k = greater(arr,i);
            ans = (ans + k-j) % mod;
        }
        return ans;
    }
    int greaterEqual(int[] arr, int i){
        int l= i+1,r=arr.length-1;
        while(l<r){
            int mid = (l+r)/2;
            if(arr[mid] - arr[i] >= arr[i]) r = mid;
            else l = mid+1;
        }
        return l;
    }
    int greater(int[] arr, int i){
        int l= i+1,r=arr.length-1;
        while(l<r){
            int mid = (l+r)/2;
            if(arr[mid] - arr[i] > arr[arr.length-1] - arr[mid]) r = mid;
            else l = mid+1;
        }
        return l;
    }
}
