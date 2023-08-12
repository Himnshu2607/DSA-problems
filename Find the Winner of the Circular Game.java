class Solution {
    public int findTheWinner(int n, int k) {
       Queue<Integer> q = new LinkedList<>();
       for(int i=1;i<=n;i++) q.add(i);
       while(q.size() !=1){
           for(int i=1;i<=k-1;i++) q.add(q.poll());
           q.poll();
       }
       return q.poll();
    }
}

// another method
class Solution {
    public int findTheWinner(int n, int k) {
        int ans =0;
        for(int i=1;i<=n;i++) ans = (ans+k) % i;
        return ans +1;
    }
}
