class Solution {
    public String smallestNumber(String pattern) {
        int nums[] = new int[pattern.length()+1];
        nums[0] = 1;
        for(int i=1;i<=pattern.length();i++){
            nums[i] =nums[i-1]+1;
        }
        for(int i=0;i<pattern.length();i++){
            int temp =i;
            while(temp < pattern.length() && pattern.charAt(temp) =='D') temp++;
            reverse(nums,i,temp);
            if(temp != i) i = temp-1;
        }
        return Arrays.toString(nums).replaceAll("\\[|\\]|,|\\s","");
    }
    void reverse(int nums[],int i,int j){
        while(i<j){
         int temp = nums[i];
         nums[i] = nums[j];
         nums[j] = temp;
         i++;j--;
        }    
    }
}
