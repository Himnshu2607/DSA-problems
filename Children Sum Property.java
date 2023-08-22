public class Solution {
    public static boolean isParentSum(Node root) {
        if(root == null || root.left == null && root.right == null) return true;
        int sum =0;
        if(root.left!=null) sum += root.left.data;
        if(root.right!=null) sum += root.right.data;
        if(root.data != sum) return false;
        boolean left = isParentSum(root.left),right = isParentSum(root.right);
        return left && right;
    }
}
