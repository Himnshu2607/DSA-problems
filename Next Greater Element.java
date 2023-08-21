class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums2.length;i++){
            for(int j=i;j<nums2.length;j++){
                if(nums2[j] > nums2[i]){
                    map.put(nums2[i],nums2[j]);
                    break;
                }
                else map.put(nums2[i],-1);
            }
        }
        for(int i=0;i<nums1.length;i++){
            nums1[i] = map.get(nums1[i]);
        }
        return nums1;
    }
}
