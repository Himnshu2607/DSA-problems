class Solution {
    public int numMatchingSubseq(String s, String[] words) {
      Map<String,Integer> map = new HashMap<>();
      for(String w : words) map.put(w,map.getOrDefault(w,0)+1);
      int count =0;
      char ch[] = s.toCharArray();

      for(String str : map.keySet()){
          char temp[] = str.toCharArray();
          int i=0,j=0;
          while(i<ch.length && j<temp.length){
              if(ch[i] == temp[j]){
                  i++;j++;
              }
              else i++;
          }
          if(j == temp.length) count +=map.get(str);
      }
      return count;
    }
}
