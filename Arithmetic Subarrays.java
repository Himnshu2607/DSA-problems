class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> ans = new ArrayList<>();
        for(int i=0;i<r.length;i++){
            List<Integer> temp = new ArrayList<>();
            for(int j=l[i];j<=r[i];j++) temp.add(nums[j]);
            Collections.sort(temp);
            int diff =0;
            for(int j=1;j<temp.size();j++){
                if(j==1) diff = temp.get(j) - temp.get(j-1);
                else if(diff != temp.get(j) - temp.get(j-1)){
                    ans.add(false);
                    break;
                }
                if(j+1 == temp.size()) ans.add(true);
            }
        }
        return ans;
    }
}
