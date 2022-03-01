package com.company.stack;

import java.util.ArrayList;
import java.util.Stack;

public class stackk {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        System.out.println(stack.empty());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(0);
        stack.push(11);
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.capacity());
    }
}
