class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode curr = head;
        while(curr.next != null){
           int g = gcd(curr.val,curr.next.val);
           ListNode temp = new ListNode(g);
           temp.next = curr.next;
           curr.next = temp;
           curr = curr.next.next; 
        }
        return head;
    }
    int gcd(int a,int b){
        return b ==0 ?a : gcd(b,a%b);
    }
}
