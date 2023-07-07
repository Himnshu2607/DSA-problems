class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
       int satisfied =0;
       int n = customers.length;
       for(int i =0;i<n;i++){
           if(grumpy[i] == 0) satisfied +=customers[i];
       } 
       int max=0,sum=0,start=0;
       for(int end = 0;end<n;end++){
           if(grumpy[end] ==1) sum +=customers[end];
           if(end-start+1 >= minutes){
               max = Math.max(max,sum);
               if(grumpy[start] == 1) sum -= customers[start];
               start++;
           }
       }
       return satisfied + max;
    }
}
