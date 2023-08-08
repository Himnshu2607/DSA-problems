class Solution {
    public int minPartitions(String n) {
        int max = Integer.MIN_VALUE;
        char ch[] = n.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(max < ch[i] -'0') max = ch[i] -'0';
        }
        return max;
    }
}
