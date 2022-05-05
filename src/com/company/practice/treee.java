package com.company.practice;

  public class treee {
      Node head;
      Node tail;
      int size;

      public treee(int size) {
          this.size = 0;
      }


      static class Node {
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

      public void addfirst(int  data) {
          Node node=new Node(data);
          if (this.head == null) {
              this.head=this.tail=node;
          }
          else {
              node.next = this.head;
              this.head = node;
              size++;
          }
      }
      public void display() {
          Node node=this.head;
          while (node!=null) {
              System.out.print(node.data + "-->");
              node=node.next;
          }
          System.out.print("null");
      }

  }

