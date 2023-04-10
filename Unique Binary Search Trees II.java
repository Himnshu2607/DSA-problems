class Solution {
    public List<TreeNode> generateTrees(int n) {
        if(n==0) return new ArrayList<>();//if n is empty
        return generateTrees(1,n); //calling function bcoz range is fron 1 to n
        }

        List<TreeNode> generateTrees(int left,int right){
            List<TreeNode> roots = new ArrayList<>();// new list to add subtrees and return 
            if(left > right) roots.add(null);//if lefts get more than right then add null bcoz in BST small value should be in left
            else{
                for(int i = left ; i <= right ; i++){//loop from left to right
                    List<TreeNode> leftTree = generateTrees(left,i-1);//subtree to add values of left subTree
                    List<TreeNode> rightTree = generateTrees(i+1,right);//subtree to add values of right subTree
                    for( TreeNode lefts : leftTree){//iterate a single value of left subTree to add in root.left
                        for(TreeNode rights : rightTree){////iterate a single value of right subTree to add in root.right
                            TreeNode root = new TreeNode(i);//new list to add single value from left and right
                            root.left = lefts;//taking root.left value from left subTree as lefts
                            root.right = rights;//taking root.right value from right subTree as rights
                            roots.add(root);//add root to roots
                        }
                    }
                }
            }
            return roots;
        }
}
