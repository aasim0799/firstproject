package com.company.binaryTree;


public class bst_inorder {
    Node root;

    public bst_inorder(){
         root=new Node(1);
         root.left=new Node(2);
         root.right=new Node(3);
         root.left.right=new Node(4);
         root.right.left=new Node(5);
         root.right.left.right=new Node(6);
    }

    public static class Node {
        int value;
        Node left;
        Node right;

        public  Node(int value) {
            this.value=value;
            this.right=this.left=null;
        }
    }

    public void inorder() {
        Node temp = root;
        inorderutil(temp);
        System.out.print("null");
        System.out.println();
    }
    public void inorderutil(Node root) {
        if (root == null) {
            return;
        }

            inorderutil(root.left);
            System.out.print(root.value+"-->");
            inorderutil(root.right);

    }
    public void inorderSearch(int val) {
        inorderUtilsearch(root,val);
    }
    public void inorderUtilsearch(Node root,int val) {
        if (root == null) {
            return;
        }
        if (root.value == val) {
            System.out.println("found value");
            return;
        }
        inorderUtilsearch(root.left,val);
        inorderUtilsearch(root.right,val);
    }

    public void preorder() {
        Node temp = root;
        preorderUtil(temp);
        System.out.print("null");
        System.out.println();
    }
    public void preorderUtil(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.value+"-->");
        preorderUtil(root.left);
        preorderUtil(root.right);
    }
    public void postorder() {
        Node temp=root;
        postorderUtil(temp);
        System.out.print("null");
        System.out.println();
    }
    public void postorderUtil(Node root) {
        if (root == null) {
            return;
        }
        postorderUtil(root.left);
        postorderUtil(root.right);
        System.out.print(root.value+"-->");
    }
}


