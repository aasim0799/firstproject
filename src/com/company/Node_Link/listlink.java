package com.company.Node_Link;

public class listlink {
    Node head;
    Node tail;
    int size;

    public listlink() {
        this.size = 0;
    }

    public static class Node {
        int data;
        Node next;


        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public Node(int data) {
            this.data = data;
        }
    }

    public void addlast(int data) {
        Node node = new Node(data, null);
        if (head == null) {
            this.head = this.tail = node;
            size++;
        } else {
            Node newnode = this.head;
            while (newnode.next != null) {
                newnode = newnode.next;
            }
            newnode.next = node;
            this.tail = node;
            this.size++;
        }
    }
    public  void reverss(){
        int i=0;
        int j=this.size-1;
          while(i<=j)
          {
           Node inode=getAt(i);
           Node jnode=getAt(j);
            int temp=inode.data;
            inode.data= jnode.data;
            jnode.data=temp;
            i++;
            j--;
        }
    }

    public void lastadd(int data) {
        Node node = new Node(data);
        if (head == null) {
            this.head = this.tail = node;
            size++;
        } else {
            this.tail.next = node;
            this.tail = node;
        }
    }


    public void print() {
        Node node = this.head;
        while (node != null) {
            System.out.print(node.data + "-->");
            node = node.next;
        }
        System.out.println("null");
    }
    public Node swap (){
        Node n=this.head;
        Node node=this.head.next;
        while(n.next != null){
            n.next=n.next.next;
            node.next=n;
            node.next=node.next.next;
            n=n.next.next;
            node=n.next;
        }
        return head;
    }
    public  void palindrome(){
        int i=0;
        int j=this.size-1;
        while(i<j){
            Node inode=getAt(i);
            Node jnode=getAt(j);
            if(inode.data == jnode.data){
                i++;
                j--;
            }
            else{
                System.out.println("not palindrome");
                return;
            }
        }
        System.out.println("palindrome");
    }


    public void addfirst(int data) {
        Node node = new Node(data);
        if (this.head == null) {
            this.head = this.tail = node;
        } else {
            node.next = this.head;
            this.head = node;
        }
        this.size++;
    }

    public void reverse() {
        Node c = this.head;
        Node p = null;
        while (c.next != null) {
            Node n = c.next;
            c.next = p;
            p = c;
            c = n;
        }
        c.next = p;
        this.head = c;
    }

    public Node getAt(int index) {
        if (index < 0 || index >= this.size) {
            System.out.println("Invalid");
            return null;
        }
        int i = 0;
        Node n = this.head;
        while (i < index) {
            i++;
            n = n.next;
        }
        return n;
    }

    public Node removelast() {
        if (this.size == 0) {
            System.out.println("Invalid");
        }
        Node node = getAt(this.size - 2);
        Node res = this.tail;
        node.next = null;
        this.tail = node;
        this.size--;
        return res;
    }

    public Node removefirst() {
        Node res = this.head;
        this.size--;
        this.head = head.next;
        res.next = null;
        return res;
    }

    public void addAt(int data, int index) {
        Node node = new Node(data, null);
        Node prev = getAt(index - 1);
        node.next = prev.next;
        prev.next = node;
        this.size++;
    }

    public void kstep(int index) {
        Node res = this.head;
        int i = 0;
        while (i < index) {
            this.head = this.head.next;
            res.next = null;
            this.tail.next = res;
            this.tail = res;
            res = this.head;
            i++;
        }
    }
    public Node midd(Node node){
        Node a =node;
        Node b=node.next;
        while(b != null && b.next != null){
            a=a.next;
            b=b.next.next;
        }
        return a;
    }
    public void remove_dup(){
        Node node=this.head;
        while(node != null && node.next != null){
            if(node.data == node.next.data){
                node.next=node.next.next;
            }
            else{
                node=node.next;
            }
        }
    }
    public void inserat(int k,int data){
        Node prev=getAt(k-2);
        Node node=new Node(data,null);
        node.next=prev.next;
        prev.next=node;
    }

}



