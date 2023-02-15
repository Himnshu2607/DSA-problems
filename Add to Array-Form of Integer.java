class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> res=new ArrayList<>();
        int carry=0,digSum=0;
        int len=num.length-1;
        while(len>=0 || k>0 || carry>0){
            digSum=carry;
            if(len>=0)digSum+=num[len--];
            if(k>0) digSum+=k%10;
            res.add(digSum%10);
            k/=10;
            carry=digSum/10;
        }
        Collections.reverse(res);
        return res;
    }
}
