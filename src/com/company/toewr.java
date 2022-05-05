package com.company;

public class toewr {
    public static void main(String[] args) {

        toh(2,'A','B','C');
    }
    public static void toh(int n,char s,char d,char h){
        if(n==0) return;
        toh(n-1,s,h,d);
        System.out.println(n+":"+s+"-->"+d);
        toh(n-1,h,d,s);
    }
}
