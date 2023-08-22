class Solution {
    public Node connect(Node root) {
        Node start=root;
        while(start!=null && start.left!=null){
            Node curr=start;
            while(true){
                curr.left.next=curr.right;
                if(curr.next==null) break;
                curr.right.next=curr.next.left;
                curr=curr.next;
            }
            start=start.left;
        }
        return root;  
    }
}
