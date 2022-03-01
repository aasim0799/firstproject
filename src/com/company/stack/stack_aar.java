package com.company.stack;

import java.util.Arrays;

public class stack_aar {
    int size=10;
    int a[]=new int[size];
    int top=-1;
    void push(int data){
        if(top>=size-1){
            System.out.println("stack_overflow");
        }
        else{
            a[++top]=data;
        }
    }
    void pop(){
        if(top==-1){
            System.out.println("stack_empty");
        }
        else{
        int vra=a[top--];
        }
    }
    void top(){
        if(top==-1){
            System.out.println("stack_underflow");
        }
        else {
            System.out.println(a[top]);
        }
    }
    void print(){
        for(int i=top;i>=0;i--){
            System.out.print("["+a[i]+"]");
        }
    }
}
