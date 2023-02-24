class Solution {
    public int minimumDeviation(int[] nums) {
    TreeSet<Integer> ts=new TreeSet<>();

    for(int n:nums){
        if(n%2==1) n*=2;
        ts.add(n);
    }
    int diff=Integer.MAX_VALUE;
    while(true){
        int min=ts.first();
        int max=ts.last();
        diff=Math.min(diff,max-min);
        if(max%2==0){
            ts.remove(max);
            ts.add(max/2);
        }
        else break;
    }
    return diff;
    }
}
