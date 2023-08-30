class Solution{

    // a: input array
    // n: size of array
    //Function to find maximum circular subarray sum.
    static int circularSubarraySum(int a[], int n) {
        
      if(n==1) return a[0];int sum =0;
      for(int i :a) sum +=i;
      int currMax =a[0],max =a[0],currMin = a[0],min =a[0];
      for(int i=1;i<n;i++){
          currMax = Math.max(currMax+a[i],a[i]);
          max = Math.max(max,currMax);
          currMin = Math.min(currMin+a[i],a[i]);
          min = Math.min(min,currMin);
      }
      if(sum == min) return max;
      return Math.max(max,sum-min);
    }
}
