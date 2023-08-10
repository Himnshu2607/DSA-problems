class Solution {
    public int[] nextLargerNodes(ListNode head) {
        List<Integer> arr = new ArrayList<>();
        int n =0;
        while(head != null){
            n++;
            arr.add(head.val);
            head = head.next;
        }
        int ans[] = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek() <= arr.get(i)) st.pop();
            if(st.isEmpty()) ans[i] = 0;
            else ans[i] = st.peek();
            st.push(arr.get(i));
        }
        return ans;
    }
}
