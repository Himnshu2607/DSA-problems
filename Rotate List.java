class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        int cnt=1;
        ListNode curr=head;
        if(head==null || head.next==null) return head;
        while(curr.next!=null){
           cnt++;
           curr=curr.next;
        }
        curr.next=head;
         k=k%cnt;
        ListNode temp=head;
        for(int i=0;i<cnt-k-1;i++){
            temp=temp.next;
        } 
        ListNode ans=temp.next;
        temp.next=null;
        return ans;
    }
}
