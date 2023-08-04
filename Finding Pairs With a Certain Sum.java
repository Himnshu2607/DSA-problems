class FindSumPairs {
    int num1[],num2[];
    Map<Integer,Integer> map = new HashMap<>();
    public FindSumPairs(int[] nums1, int[] nums2) {
        num1 = nums1;
        num2 = nums2;
        for(int num : num2) map.put(num,map.getOrDefault(num,0)+1);
    }
    
    public void add(int index, int val) {
        map.put(num2[index],map.getOrDefault(num2[index],0) -1);
        num2[index] += val;
        map.put(num2[index],map.getOrDefault(num2[index],0) +1);
    }
    
    public int count(int tot) {
        int count = 0;
        for(int num : num1) count += map.getOrDefault(tot - num,0);
        return count;
    }
}
