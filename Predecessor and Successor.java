public static void findPreSuc(Node root, int key)
{
    if(root == null) return;
    if(root.data == key){
        if(root.left != null){
            Node temp = root.left;
            while(temp.right!= null)temp  = temp.right;
            pre = temp;
        }
        if(root.right != null){
            Node temp = root.right;
            while(temp.left!= null)temp  = temp.left;
            suc = temp;
        }
        return;
    }
    if(root.data < key){
        pre = root;
        findPreSuc(root.right,key);
    }
    else {
        suc = root;
        findPreSuc(root.left,key);
    }
}
}
