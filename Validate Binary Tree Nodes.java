class Solution {
    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
        int root = findRoot(n,leftChild,rightChild);
        if(root == -1) return false;
        Set<Integer> set = new HashSet<>();
        Stack<Integer> st = new Stack<>();
        set.add(root);
        st.push(root);
        while(!st.isEmpty()){
            int curr = st.pop();
            int children[] = {leftChild[curr],rightChild[curr]};
            for(int child : children){
                if(child != -1){
                    if(set.contains(child)) return false;

                    set.add(child);
                    st.push(child);
                } 
            }
        }
        return set.size() == n;
    }
    int findRoot(int n,int left[],int right[]){
        Set<Integer> child = new HashSet<>();
        for(int l : left) child.add(l);
        for(int r: right) child.add(r);
        for(int i=0;i<n;i++){
            if(!child.contains(i)) return i;
        }  
        return -1;
    }
}
