class Solution {
    List<Integer> ans=new ArrayList<>();
    public Solution(ListNode head) {
        while(head!=null){
            ans.add(head.val);
            head=head.next;
        }
    }
    
    public int getRandom() {
       double rand=Math.random()*ans.size();
    return ans.get((int)rand);
    }
}
