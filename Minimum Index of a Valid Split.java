class Solution {
    public int minimumIndex(List<Integer> nums) {
        int ans =0,count=0,n=nums.size();
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:nums) map.put(num,map.getOrDefault(num,0)+1);
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int key = entry.getKey();
            int val = entry.getValue();
            if(val *2 >n){
                ans = key;
                count = val;
                break;
            }
        }
        int preCount = 0;
        for(int i=0;i<n-1;i++){
            if(nums.get(i) == ans){
                preCount++;
                count--;
            }
            if(preCount >(i+1) /2 && count >(n-i-1) /2) return i;
        }
        return -1;
    }
}
