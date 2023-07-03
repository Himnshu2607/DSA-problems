class Solution {
    public long minimalKSum(int[] nums, int k) {
        Arrays.sort(nums);
        long res=0,c=1;
        for(int i : nums){
            if(i>c){
                while(i>c && k-- >0){
                    res+=c;
                    c++;
                }
            }
            c = i+1;
        }
        while(k-- >0){
            res+=c;
            c++;
        }
        return res;
    }
}
