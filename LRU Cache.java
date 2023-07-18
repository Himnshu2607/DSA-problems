class LRUCache {
    int capacity;
    Map<Integer,Integer> map;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new LinkedHashMap<>();
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            int k = (int) map.get(key);
            map.remove(key);
            map.put(key,k);
            return k;
        }
        return -1;
    }
    
    public void put(int key, int val) {
         if(map.containsKey(key)){
           map.remove(key);
           map.put(key,val);
         }
         else{
             map.put(key,val);
             int s = map.size();
             if(s>capacity){
                 int old = map.keySet().iterator().next();
                 map.remove(old);
             }
         }
    }
}
