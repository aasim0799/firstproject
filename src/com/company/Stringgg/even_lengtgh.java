package com.company.Stringgg;

public class even_lengtgh {
    public static void main(String[] args) {
        String s="aasim momin";
        even(s);
    }
    public static void even(String s){
        char [] arr=s.toCharArray();
        int i=0;
        int j=0;
        int len=0;
        while(j<arr.length){
            if(j == arr.length-1 && len%2 == 0){
                while(i<arr.length){
                    System.out.print(arr[i]);
                    i++;
                }
            }
            if(arr[j] == ' ' && len%2 == 0){
                while(i<j){
                    System.out.print(arr[i]);
                    i++;
                }
                i++;
                len=0;
                System.out.print(" ");
            }
            else if(arr[j] == ' ' && len%2 != 0){
                i=len+1;
                len=0;
            }
            j++;
            len++;
        }

    }
}
