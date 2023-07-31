class Solution {
    public String longestPrefix(String s) {
        int n = s.length();
        int l=1,r=0;
        int[] arr = new int[n];

        while(l<n){
            if(s.charAt(l) == s.charAt(r)) {
                r++;
                arr[l] = r;
                l++;
            }
            else{
                if(r>0) r = arr[r-1];
                else{
                    arr[l]=0;l++;
                }
            }
        }
        return s.substring(0,arr[n-1]);
    }
}
