class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int count=0;
        Arrays.sort(people);
        int start=0,end=people.length-1;
        while(start<=end){
            int sum=people[start]+people[end];
            if(sum<=limit){
                count++;
                start++;
                end--;
            }
            else{
                count++;
                end--;
            }
        }
        return count;
    }
}
