class Solution {
        public int totalFruit(int[] fruits) {
        int last_fruit=-1,second_last_fruit=-1;
        int count=0,curr_max=0,max=0;

        for(int fruit : fruits){
            if(fruit == last_fruit || fruit == second_last_fruit){
                curr_max+=1;
            }
            else{
                curr_max=count+1;
            }
            if(fruit==last_fruit){
                count+=1;
            }
            else{
                count=1;
            }
            if(fruit!=last_fruit){
                second_last_fruit = last_fruit;
                last_fruit = fruit;
            }
            max=Math.max(curr_max,max);
        }
        return max;
    }
}
