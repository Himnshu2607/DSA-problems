class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums) map.put(num,map.getOrDefault(num,0)+1);
        for(Map.Entry e : map.entrySet()){
            int value = (int) e.getValue(),key = (int) e.getKey();
            if(value > n/3) ans.add(key);
        }
        return ans;
    }
}
