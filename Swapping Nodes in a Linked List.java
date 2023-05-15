class Solution {
    public ListNode swapNodes(ListNode head, int k) {
       ListNode curr = head, l = head , r = head;
       int count = 1;
       while(curr!=null){
           if(count < k) l = l.next;
           if(count > k) r = r.next;
           count++;
           curr = curr.next;
       }
        int temp = l.val;
        l.val = r.val;
        r.val = temp;
        return head;
    }
}
