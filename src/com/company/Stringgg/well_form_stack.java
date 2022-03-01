package com.company.Stringgg;

import java.util.Arrays;
import java.util.Stack;

public class well_form_stack {
    public static void main(String[] args) {
        String s = "{[()]}";
        if(well(s)){
            System.out.println("well formed");
        }
        else{
            System.out.println("not well");
        }
    }
    public static boolean well(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '{' || ch == '[' || ch == '(') {
                stack.push(ch);
            } else if (ch == '}' && stack.peek() == '{') {
                stack.pop();
            } else if (ch == ']' && stack.peek() == '[') {
                stack.pop();
            } else if (ch == ')' && stack.peek() == '(') {
                stack.pop();
            }
        }
        if (stack.isEmpty()) {
            return true;
        }
        else{
            return false;
        }
    }
}
