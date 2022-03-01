package com.company.Stringgg;

import java.util.Arrays;

public class reverse_each_char {
    public static void main(String[] args) {
        String s="Welcome to this Javascript Guide!";
        // s="misaa nimom
        array(s);
    }
    public static void array(String s){
        char[] arr =s.toCharArray();
        int j=0;
        int len;
        int i=0;
        char temp;
        while(j<arr.length){
            if(arr[j] == arr[arr.length-1]){
                len=j;
                while(i<len){
                    temp=arr[i];
                    arr[i]=arr[len];
                    arr[len]=temp;
                    i++;
                    len--;
                }
            }
             else if(arr[j+1] == ' '){
                len=j;
                while(i<len){
                    temp=arr[i];
                    arr[i]=arr[len];
                    arr[len]=temp;
                    i++;
                    len--;
                }
                i=j+2;
            }
            j++;
        }
        System.out.print(new String(arr));
    }
}
