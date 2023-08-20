class Solution {
    public long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        int merge[] = new int[n+m];
        int i=0,j=0,l=0;
        while(i<n && j<m){
            if(arr1[i] <= arr2[j]){
                merge[l] = arr1[i];
                i++;
            }
            else{
              merge[l] = arr2[j];
                j++;  
            }
            l++;
        }
        while(i<n){
            merge[l] = arr1[i];
                i++;l++;
        }
        while(j<m){
            merge[l] = arr2[j];
                j++;l++;
        }
        return merge[k-1];
    }
}
