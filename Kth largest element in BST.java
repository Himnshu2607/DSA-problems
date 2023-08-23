class Solution
{
    // return the Kth largest element in the given BST rooted at 'root'
    public int kthLargest(Node root,int k)
    {
        Stack<Node> st = new Stack<>();
        while(root!=null || !st.isEmpty()){
            while(root!=null){
                st.push(root);
                root = root.right;
            }
            root = st.pop();
            k--;
            if(k == 0) return root.data;
            root = root.left;
        }
        return -1;
    }
}
