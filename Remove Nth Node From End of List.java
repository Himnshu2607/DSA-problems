class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
         ListNode curr=head;
        int count=1;
        while(curr.next!=null){
            curr=curr.next;
            count++;
        }
        if(count==n) return head.next;
        ListNode temp=head;
        for(int i=0;i<count-n-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
    }
}
