class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode r1 = reverse(l1);
        ListNode r2 = reverse(l2);
        int sum = 0,carry = 0;
        ListNode ans = new ListNode();
        while(r1 != null || r2!= null){
            if(r1!= null) sum +=r1.val;
            if(r2!= null) sum +=r2.val;

            ans.val = sum %10;
            carry = sum /10;
            ListNode head = new ListNode(carry);
            head.next = ans;
            ans = head;
            sum = carry;
            r1 = r1 != null ? r1.next : null;
            r2 = r2 != null ? r2.next : null;
        }
        return carry == 0 ? ans.next : ans;
    }
    ListNode reverse(ListNode head){
        ListNode prev = null,temp;
        while(head != null){
            temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }
}
