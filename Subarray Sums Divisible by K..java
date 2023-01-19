class Solution {
    public int subarraysDivByK(int[] nums, int k) {
    int count[]=new int[k];
    int sum=0;
    for(int n: nums){
        sum+=(n%k+k)%k;
        count[sum%k]++;
    }
    int res=count[0];
    for(int i: count) res+=i*(i-1)/2;
    return res;
    }
}
