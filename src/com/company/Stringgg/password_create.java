package com.company.Stringgg;
import java.util.*;

public class password_create {
    public static void main(String[] args) {
//        Scanner scan=new Scanner(System.in);
//        int test=scan.nextInt();
//        for (int i = 0; i < test; i++) {
//            String s=scan.next();
//            snow(s);
//        }
        String s="Geek";
        snow(s);
    }
    public static void snow(String s){
        char [] arr=s.toCharArray();
        int uppercase=0;
        int lowercase=0;
        int numeric=0;
        char ch;
        for (int i = 0; i < arr.length; i++) {
            ch=arr[i];
            if(ch >= 'A' && ch <= 'Z'){
                uppercase++;
            }
            else if(ch >= 'a' && ch <= 'z'){
                lowercase++;
            }
            else{
                numeric++;
            }
        }
        if(uppercase > 0 && lowercase > 0 && numeric > 0){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
