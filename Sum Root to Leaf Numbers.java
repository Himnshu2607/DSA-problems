class Solution {
  int ans;
    public int sumNumbers(TreeNode root) {
        ans = 0;
        solve(root,0);
        return ans;
    }
    void solve(TreeNode root, int sum){
      if(root == null) return;
      sum = sum*10 + root.val;
      if(root.left == null && root.right == null) {
        ans +=sum;

      }
      solve(root.left,sum);
      solve(root.right,sum);
    }
}
