public class Solution {

    public static int minCharsforPalindrome(String str) {
        int i=0,j = str.length() -1,temp = str.length() -1,res =0;
        while(i<j){
            if(str.charAt(i) == str.charAt(j)){
                i++;j--;
            }
            else {
                res++;
                i =0;j = --temp;
            }
        }
        return res;
    }

}
