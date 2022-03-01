package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class hass {
    int top;
    int size;
    int [] arr;

    hass()
    {
        top=-1;
        size=10;
        arr = new int[size];
    }
    public boolean isEmpty()
    {
        return top==-1;
    }
    public boolean isFull()
    {
        return top==size-1;
    }
     public int  push(int data)
    {
        if(isFull()){
            System.out.println("stack is full");
        }
            return arr[++top]=data;
    }
    public int pop()
    {
        if(isEmpty()){
            System.out.println("stack is empty");
        }
        return arr[top--];
    }
    public int peek()
    {
        return arr[top];
    }
    public void display(){
        for(int i:arr){
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        hass st=new hass();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st.isEmpty());
        System.out.println(st.isFull());
        System.out.println(st.size);
        System.out.println(st.peek());
        System.out.println(st.pop());
        st.display();

    }


}


