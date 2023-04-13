class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st = new Stack<>();
        int j = 0;
        for(int x :pushed){
            st.push(x);
            while(!st.isEmpty() && j < pushed.length && st.peek() == popped[j]){
                st.pop();
                j++;
            }
        }
            return st.isEmpty();
    }
}
