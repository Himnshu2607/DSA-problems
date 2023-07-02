class Solution {
    public List<List<Integer>> findPrimePairs(int n) {
       List<List<Integer>> res = new ArrayList<>();
       for(int i=2;i<=n/2;i++){
           if(isPrime(i) && isPrime(n-i)) 
           {
               List<Integer> ans = new ArrayList<>();
               ans.add(i);
               ans.add(n-i);
               res.add(ans);
           }   
       } 
       return res;
    }
    boolean isPrime(int n){
        if(n<=1) return false;
       if(n ==2 || n==3) return true;
       if(n%2 ==0 || n%3 ==0) return false;
       for(int i=5;i*i<=n;i +=6){
           if(n%i ==0 || n%(i+2) ==0) return false;
       }   
        return true;
    }
}
