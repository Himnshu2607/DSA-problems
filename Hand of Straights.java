class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
       if(hand.length % groupSize !=0) return false;
       PriorityQueue<Integer> pq= new PriorityQueue<>();
       for(int h : hand) pq.add(h); 

       while(!pq.isEmpty()){
           int val = pq.peek();
           for(int i=val;i<val+groupSize;i++)
           if(!pq.remove(i)) return false;
       }
       return true;
    }
}
