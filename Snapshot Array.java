class SnapshotArray {
    List<TreeMap<Integer,Integer>> arr;
    int snapId;

    public SnapshotArray(int length) {
    arr = new ArrayList<>();
    for(int i=0;i<length;i++){
     arr.add(new TreeMap<>());
     arr.get(i).put(0,0);
    }  
    }
    
    public void set(int index, int val) {
        arr.get(index).put(snapId,val);
    }
    
    public int snap() {
        return snapId++;
    }
    
    public int get(int index, int snap_id) {
      TreeMap<Integer,Integer> map = arr.get(index);
      return map.floorEntry(snap_id).getValue();  
    }
}
