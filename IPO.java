class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        if(profits==null || profits.length==0) return w;
        int n=profits.length;
        Queue<Integer> capitalQ=new PriorityQueue<>(new Comparator<Integer>(){
         public int compare(Integer A,Integer B){
             return capital[A] - capital[B];
         }
        });
        Queue<Integer> profitQ=new PriorityQueue<>(new Comparator<Integer>(){
         public int compare(Integer A,Integer B){
             return profits[B] - profits[A];
         }
        });
        for(int i=0;i<n;i++){
            capitalQ.add(i);
        }
        for(int i=0;i<k;i++){
            while(!capitalQ.isEmpty() && w>=capital[capitalQ.peek()])
            profitQ.add(capitalQ.poll());

            if(profitQ.isEmpty()) break;
            w+=profits[profitQ.poll()];

        }
        return w;
    }
}
