class Solution {
    public int numWays(String s) {
        long n=s.length();
        long one=0,mod =1000000007;
        char[] ch = s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i] == '1') one++; 
        }
        if(one == 0) return(int)((((n-1)*(n-2))/2)%mod);
        if(one%3 != 0) return 0;
        long ones =one/3;
        one =0;
        long part1=0,part2=0;
        for(int i=0;i<ch.length;i++){
            if(ch[i] == '1') one++;
            if(one == ones) part1++;
            if(one == 2*ones) part2++;
        }
        return (int)((part1 * part2) %mod);
    }
}
