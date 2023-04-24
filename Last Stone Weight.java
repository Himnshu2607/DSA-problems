class Solution {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int num : stones) pq.add(num);
        while(pq.size()!=1 && !pq.isEmpty()){
            int y=pq.poll();
            int x=pq.poll();
            if(x!=y) pq.add(y-x);
        } 
        return pq.size()==1 ? pq.peek() : 0;
    }
}
