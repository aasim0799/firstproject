package com.company;

public class linear {
    public static void main(String[] args) {
     String s="my world is full";
     int count =0;
     for(int i=0;i<s.length();i++){
         if(s.charAt(i)==' '){
             count=0;
         }
         else{
             count++;
         }
     }
        System.out.println(count);
    }
}
