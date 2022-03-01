package com.company.stack;

public class stack_use_linklist {

    public class Node{
        int  data;
        Node next;

        Node(int data){
            this.data=data;
        }
        Node (int data,Node next){
            this.data=data;
            this.next=next;
        }
    }
    Node top=null;
    public void push(int data){
        Node node=new Node(data);
        node.next=top;
        top=node;
    }
    public void pop(){
        if(top==null){
            return;
        }
        else {
            top = top.next;
        }
    }
    public void top(){
        if(top==null){
            System.out.println(0);
        }
        else{
            System.out.println(top.data);
        }
    }
}
