class Solution {
    int rank[];
    int root[];
    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        int size = s.length();
        root = new int[size];
        rank = new int[size];
        for(int i=0;i<size;i++) root[i] = i;
        for(List<Integer> pair:pairs){
            union(pair.get(0),pair.get(1));
        }
        for(int i=0;i<size;i++){
            root[i] = find(root[i]);
        }
        Map<Integer,List<Character>> map = new HashMap<>();
        for(int i=0;i<size;i++){
            List<Character> li = map.getOrDefault(root[i],new ArrayList<>());
            li.add(s.charAt(i));
            map.put(root[i],li);
        }
        for(List<Character> a : map.values()){
            Collections.sort(a,(x,y) -> y-x);
        }
        char ch[] = new char[size];
        for(int i=0;i<size;i++) ch[i] = map.get(root[i]).remove(map.get(root[i]).size()-1);

        return new String(ch);
    }  
        int find(int x){
            if(x==root[x]) return x;
            return root[x] = find(root[x]);
        }
        void union(int x,int y){
            int rootX = find(x);
            int rootY = find(y);
            if(rootX != rootY){
                if(rank[rootX] > rank[rootY]) root[rootY] = rootX;
                else if(rank[rootX] < rank[rootY]) root[rootX] = rootY;
                else{
                    root[rootY] = rootX;
                    rank[rootX] += 1;
                }
            }
        }
}
