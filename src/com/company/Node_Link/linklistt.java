package com.company.Node_Link;

public class linklistt {
    Node head;
    Node tail;
    int size;

    public linklistt() {
        this.size = 0;
    }


    public static class Node{
        Node next;
        int data;

        public Node(Node next, int data) {
            this.next = next;
            this.data = data;
        }
        public Node(int data){
            this.data=data;
        }

    }
    public void addlast(int data){
        Node node=new Node(data);
        if(this.tail==null){
            this.tail=this.head=node;
        }
        else{
            this.tail.next=node;
            this.tail=node;
        }
        this.size++;
    }
    public void print(){
        Node node=this.head;
        while(node != null){
            System.out.print(node.data+"-->");
            node=node.next;
        }
        System.out.println("null");
    }
    public Node getat(int index){
        int i=0;
        Node n=this.head;
        while(i<index){
            i++;
            n=n.next;
        }
        return n;
    }
    public void palindrome(){
     int i=0;
     int j=this.size-1;
      while(i<j){
          Node inode=getat(i);
          Node jnode=getat(j);
        if(inode.data != jnode.data) {
            System.out.println("not palindrome");
            return;
        }
        else{
            i++;
            j--;
        }
      }
        System.out.println("palindrome");
    }
    public static Node middle(Node start,Node end){
        if(start==null){
            return null;
        }
        Node slow = start;
        Node fast=start.next;
        while(fast != end){
            fast=fast.next;
            if(fast!=end){
                slow=slow.next;
                fast=fast.next;
            }
        }
        return slow;
    }
}
