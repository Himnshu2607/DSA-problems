import java.util.*;
public class Solution {
    public static void immediateSmaller(int []a) {
        Stack<Integer> st = new Stack<>();
        int n = a.length;
        st.push(a[n-1]);
        int i = n-2;
        while(i >-1 && !st.isEmpty()){
           if(st.peek() < a[i]){
               int element = a[i];
               a[i] = st.peek();
               st.pop();
               st.push(element);
           } 
           else{
               st.pop();
               st.push(a[i]);
               a[i] = -1;
           }
           i--;
        }
        a[n-1] = -1;
    }
}
