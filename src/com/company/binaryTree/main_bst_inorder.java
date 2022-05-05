package com.company.binaryTree;

public class main_bst_inorder {
    public static void main(String[] args) {
        bst_inorder tree=new bst_inorder();
        tree.preorder();
        tree.inorder();
        tree.postorder();
        tree.inorderSearch(3);
    }
}
