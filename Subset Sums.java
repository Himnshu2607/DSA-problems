class Solution{
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        Collections.sort(arr);
        ArrayList<Integer> ans = new ArrayList<>();
        solve(0,ans,arr,0,N);
        return ans;
    }
    void solve(int idx,ArrayList<Integer> ans,ArrayList<Integer> arr,int sum,int N){
        if(idx == N){
            ans.add(sum);
            return;
        }
        solve(idx+1,ans,arr,sum+arr.get(idx),N);
        solve(idx+1,ans,arr,sum,N);
    }
}
