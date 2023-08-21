class Solution {
    public boolean isAnagram(String s, String t) {
        int n=s.length();
        int m=t.length();
        if(n!=m) return false;
        char[] c1=s.toCharArray();
        char[] c2=t.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        
        return Arrays.equals(c1,c2);
    }
} 
// more optimal
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int count[] = new int[125];
        for(char c : s.toCharArray()) count[c]++;
        for(char c : t.toCharArray()) {
            if(--count[c] <0) return false;
        } 
        return true;
    }
}
