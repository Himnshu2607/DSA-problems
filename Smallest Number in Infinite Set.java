class SmallestInfiniteSet {
    int curr;
    Set <Integer> st;
    public SmallestInfiniteSet() {
         curr = 1;
        st = new HashSet<>();
    }
    
    public int popSmallest() {
       if(!st.isEmpty()){
           int ans = Collections.min(st);
           st.remove(ans);
           return ans;
       }
       else{
           curr++;
           return curr - 1;
       }
    }
    
    public void addBack(int num) {
        if(curr > num) st.add(num);
    }
}
