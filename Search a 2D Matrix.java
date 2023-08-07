class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        int c = mat[0].length;
        int v = binary(mat,target);
        for(int i=0;i<c;i++){
            if(mat[v][i] == target) return true;
        }
        return false;
    }
    int binary(int arr[][] ,int target){
        int l=0,r=arr.length-1,c = arr[0].length-1;
        while(l<=r){
            int mid = (l+r)/2;
            if(arr[mid][0] <= target && target <= arr[mid][c]) return mid;
            if(arr[mid][0] < target) l = mid+1;
            else r = mid -1;
        }
        return 0;
    }
}
