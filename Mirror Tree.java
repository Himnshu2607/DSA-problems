class Solution {
    // Function to convert a binary tree into its mirror tree.
    void mirror(Node node) {
        if(node == null) return;
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        while(!q.isEmpty()){
            Node temp = q.remove();
            
            Node curr = temp.left;
            temp.left = temp.right;
            temp.right = curr;
            if(temp.left!= null) q.add(temp.left);
            if(temp.right!= null) q.add(temp.right);
        }
        
    }
}
