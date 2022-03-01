package com.company.Stringgg;

public class remmoe_white {
    public static void main(String[] args) {
        String s="ja va sta r";
        white(s);
        white_sp(s);
    }
    public static void white(String s){
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch=s.charAt(i);
            if(ch == ' '){
                continue;
            }
            System.out.print(ch);
        }
        System.out.println();
    }
    public static void white_sp(String s){
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch=s.charAt(i);
            if(ch != ' ') {
                System.out.print(ch + "");
            }
        }
    }
}
