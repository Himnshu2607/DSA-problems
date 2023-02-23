class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = 0;
        int right = 0;
        for(int i : weights){
            left = Math.max(left, i);
            right += i;
        }
        int mid;
        int ans = right;
        while(left <= right){
            mid = (left + right) / 2;
            if(check(weights, days, mid)){
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
    boolean check(int[] weights,int days,int capacity){
        int requiredDays = 1,currWeight=0;
        for(int x:weights){
           if(currWeight+x> capacity){
               requiredDays++;
               currWeight=0;
           }
           currWeight+=x; 
        }
        if(requiredDays>days) return false;
        return true;
    }
    
}
