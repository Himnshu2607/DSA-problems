class Solution {
    public boolean asteroidsDestroyed(int mass, int[] ast) {
        Arrays.sort(ast);
        for(int as : ast){
            if(mass < as) return false;
            else mass += as;
            if(mass > 100000) return true;
        }
        return true;
    }
}
// another tarika
class Solution {
    public boolean asteroidsDestroyed(int mass, int[] ast) {
        Arrays.sort(ast);
        long m = mass;
        for(int as : ast){
            if(m < as) return false;
            else m += as;
        }
        return true;
    }
}
