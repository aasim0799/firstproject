package com.company.Node_Link;

public class revlink {
    Node head;
    Node tail;
    int size;

    public revlink(){
        this.size=0;
    }

    public static class Node{
        Node next;
        int data;

        public Node(Node next, int data) {
            this.next = next;
            this.data = data;
        }

        public  Node(int data){
            this.data=data;
        }
    }
    public void add(int data){
        Node node=new Node(data);
        node.next=this.head;
        this.head=node;
        this.size++;
    }
    public Node getat(int index){
        int i = 0;
        Node n = this.head;
        index =index -1;
        while (i < index) {
            i++;
            n = n.next;
        }
        return n;
    }
    public void print(){
        Node node=this.head;
        while(node!=null){
            System.out.print(node.data+"-->");
            node=node.next;
        }
        System.out.println("null");
    }
    public void rever(){
        int i=0;
        int j=this.size-1;
        while(i<j){
            Node inode=getat(i);
            Node jnode=getat(j);
            int temp= inode.data;
            inode.data= jnode.data;
            jnode.data=temp;
            i++;
            j--;
        }
    }
    public void kstep(int index){
        Node res=this.head;
        int i=0;
        while(i<index) {
            this.head = this.head.next;
            res.next = null;
            this.tail.next =res;
            this.tail = res;
            res=this.head;
            i++;
        }
    }
    public  void palindrome(){
        int i=0;
        int j=this.size-1;
        while(i<j){
            Node inode=getat(i);
            Node jnode=getat(j);
            if(inode.data == jnode.data){
                i++;
                j--;
            }
            else{
                System.out.println("not palindrome");
                break;
            }
        }
        System.out.println("palindrome");
    }

    public int mid(){
        Node a=this.head;
        Node v=this.head;
        while(a.next != null){
            a=a.next.next;
            v=v.next;
        }
        //v=v.next;
        return v.data;
    }
    public void reversaol(){
        Node c=this.head;
        Node p=null;
        while(c.next != null){
            Node n=c.next;
            c.next=p;
            p=c;
            c=n;
        }
        c.next=p;
        this.head=c;
    }
    public void remm(){
        Node node=this.head;
        this.head=this.head.next;
        node.next=null;
    }
    public void remove1(int index){
      Node  prevnode=getat(index-1);
      Node node =getat(index);
       prevnode.next=prevnode.next.next;
       node.next=null;
    }
}
