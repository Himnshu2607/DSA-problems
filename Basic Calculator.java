class Solution {
    public int calculate(String s) {
        int res = 0,sum = 0,sign = 1;
        Stack <Integer> st = new Stack<>();
        st.push(1);
        for(char c : s.toCharArray()) {
            if(Character.isDigit(c)) sum = sum * 10 + c - '0';
            else{
             res += sum * sign * st.peek();
             sum = 0;
             if(c =='+') sign = 1;
             else if(c == '-') sign = -1;
             else if(c =='('){
                 st.push(sign * st.peek());
                 sign = 1;
             }
             else if(c ==')') st.pop();
            }
        }
        return res +=sum * sign;
    }
}
