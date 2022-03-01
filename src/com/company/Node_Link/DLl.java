package com.company.Node_Link;

public class DLl {
        Node head;
        Node tail;
        int size;

    public DLl() {
        this.size = 0;
    }

    public static class Node{
        Node next;
        Node prev;
        int data;

        public Node(Node next, Node prev, int data) {
            this.next = next;
            this.prev = prev;
            this.data = data;
        }

        public  Node(int data){
            this.data=data;
        }
    }
    public void insertfirst(int data){
        Node node = new Node(data);
        node.next=this.head;
        node.prev=null;
        if(head != null){
            this.head.prev=node;
        }
        this.head=node;
    }
    public void print(){
        Node node=this.head;
        Node last=null;
        while(node != null){
            System.out.print(node.data+"->");
            last=node;
            node=node.next;
        }
        System.out.println("null");
    }
    public void insertlast(int data){
        Node node = new Node(data);
        if(this.tail == null){
            this.tail=this.head=node;
        }
        else{
            node.prev=this.tail;
            this.tail.next=node;
            this.tail=node;
        }
        this.size++;
    }

}
