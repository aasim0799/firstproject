package com.company.stack;

public class stack_use_arra {
   int top;
   int size;
   int a[];

    stack_use_arra(){
         top = -1;
         size=3;
        a = new int[size];
    }
    boolean isempty(){
        return top == -1;
    }
    boolean isfull(){
        return top == size-1;
    }
    public int push(int data){
        if(isfull()){
            System.out.println("full");
        }
            return a[++top] = data;
    }
    public int pop(){
        if(isempty()){
            System.out.println("empty");
        }
        return a[top--];
    }
    public int peek(){
        return a[top];
    }


    public static void main(String[] args) {
    stack_use_arra stack=new stack_use_arra();
      stack.push(1);
      stack.push(2);
      stack.push(3);
        System.out.println(stack.isempty());
        System.out.println(stack.isfull());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }

}
