class Solution {
    public int repeatedStringMatch(String a, String b) {
        String s = a;
        int len = b.length()/ a.length();
        int count = 1;
        for(int i=0;i<len+2;i++){
            if(a.contains(b))return count;
            else {
                a +=s;
                count++;
            }
        }
        return -1;
    }
}
