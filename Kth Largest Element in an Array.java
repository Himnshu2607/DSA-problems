class Solution {
    public int findKthLargest(int[] nums, int k) {
        List<Integer> li = new ArrayList<>();
        for(int num : nums) li.add(num);
        return solve(li,k);
    }
    int solve(List<Integer> li,int k){
        int idx = new Random().nextInt(li.size());
        int pivot = li.get(idx);

        List<Integer> left = new ArrayList<>();
        List<Integer> mid = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        for(int l : li){
            if(l > pivot) left.add(l);
            else if(l< pivot) right.add(l);
            else mid.add(l);
        }
        if(k <= left.size()) return solve(left,k);
        if(left.size() + mid.size() <k) return solve(right,k-left.size() - mid.size());
        return pivot;
    }
}
// another method
class Solution {
    public int findKthLargest(int[] nums, int k) {
       PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num : nums) pq.add(num);
        while(pq.size() >k) pq.remove();
        return pq.peek();
     }
}
