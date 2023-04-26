class Solution {
    public int addDigits(int num) {
     while(num/10>=1){
         int div = num%10;
         num/= 10;
         num+= div;
     }
     return num;
    }
}
