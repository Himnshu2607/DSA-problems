class Solution {
     List<List<Integer>> res=new ArrayList<>();
      Set<List<Integer>> ans=new HashSet<>();
      void method(int[] nums,int index,int prev,List<Integer> list){
          if(index==nums.length){
              if(list.size()>=2){
               ans.add(list);
              }
               return;
          }

          if(prev==-1|| nums[index]>= nums[prev]){
              List<Integer> temp=new ArrayList<>(list);
              temp.add(nums[index]);
              method(nums,index+1,index,temp);
          }
          method(nums,index+1,prev,list);
      }
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<Integer> temp=new ArrayList<>();
        method(nums,0,-1,temp);
        Iterator<List<Integer>> loop=ans.iterator();
        while(loop.hasNext()) res.add(loop.next());
        return res;
    }
}
