class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        
        return convert(head);
    }
         public TreeNode convert(ListNode head){
        if(head == null ) return null;
        
        ListNode mid = findMiddle(head);
        if(mid == head) return new TreeNode(head.val);        

        TreeNode node = new TreeNode(mid.val);
        
        node.left = convert(head);
        node.right = convert(mid.next);
        
        return node;    
        
    }
    
    public ListNode findMiddle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = null;
        
        while(fast!=null && fast.next!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        if(prev!=null) prev.next = null;
        
        return slow;
    }

    
}
