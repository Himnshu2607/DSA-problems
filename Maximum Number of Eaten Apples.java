class Solution {
    class Apple{
        int count ,range;
        Apple(int count,int range){
            this.count = count;
            this.range = range;
        }
    }
    public int eatenApples(int[] apples, int[] days) {
        int n = apples.length;
        PriorityQueue<Apple> q = new PriorityQueue<>(n,(b1,b2) -> b1.range-b2.range);
        int i,apple = 0;
        for(i=0; i<n; i++){
            while(q.peek()!=null && (q.peek().count < 1 || q.peek().range < i+1)){
                q.poll();
            }
            if(apples[i] != 0 && days[i] !=0){
                q.add(new Apple(apples[i], i+days[i]));
            }
            if(q.peek()==null) continue;           
            q.peek().count--;
            apple++;
        }
                
        while(q.peek() != null){
            Apple app = q.poll();
            if(app.range < i) continue;
            apple += Math.min(app.count, app.range-i);
            i += Math.min(app.count,app.range-i);
        }
        return apple;
    }
}
