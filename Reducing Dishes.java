class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        List<Integer> list = new ArrayList<>();
        int sum = 0,ans=0;
        for(int i=satisfaction.length-1;i>=0;i--){
            sum = sum + satisfaction[i];
            if(sum>=0) {
                list.add(satisfaction[i]);
            }
           else break;  
        }
        Collections.reverse(list);
        for(int j=1;j<=list.size();j++){
               ans+= list.get(j-1) * j;
            }
        return ans;
            }
}
