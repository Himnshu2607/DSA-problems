class Solution {
    int[] arr;
    public boolean equationsPossible(String[] equations) {
        arr = new int[26];
        for(int i=0;i<26;i++) arr[i] = i;
        for(String str : equations){
            if(str.charAt(1) == '='){
                int p1 = solve(str.charAt(0) -'a');
                int p2 = solve(str.charAt(3) -'a');
                if(p1 != p2) arr[p2] = p1;
            }
        }
        for(String str : equations){
            if(str.charAt(1) == '!'){
                int p1 = solve(str.charAt(0) -'a');
                int p2 = solve(str.charAt(3) -'a');
                if(p1 == p2) return false;
            }
        }
        return true;
    }
    int solve(int n){
        return arr[n] == n ? n :(arr[n] = solve(arr[n]));
    }
}
