package com.company.stack;

import java.util.Stack;

public class aray_palin {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1};
        if(pr(arr)) {
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }

        public static boolean pr (int [] arr) {
            Stack<Integer> st = new Stack<>();
            for (int i = 0; i < arr.length; i++) {
                st.push(arr[i]);
            }
            for (int j = 0; j <arr.length; j++) {
                if (st.peek() == arr[j]) {
                    st.pop();
                }
                else {
                   return false;
                }
            }
            return true;
        }
}
