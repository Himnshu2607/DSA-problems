public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] repeatedNumber(final int[] arr) {
        int miss = 0, repeat = 0;
        int[] ans = new int[2];
        for (int i = 0; i < arr.length; ++i)
        {
        if(arr[Math.abs(arr[i])-1] > 0)
            arr[Math.abs(arr[i])-1] = -arr[Math.abs(arr[i])-1];
            
        else
            ans[0] = Math.abs(arr[i]);
    }
    
    for (int i = 0; i < arr.length; ++i)
    {
        if(arr[i] > 0)
            ans[1]= i+1;  
    }
    return ans;
    }
}
