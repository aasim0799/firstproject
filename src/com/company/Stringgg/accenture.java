package com.company.Stringgg;

public class accenture {
    public static void main(String[] args) {
        String input1="aasim is boss";
        String input2="s";
      //  System.out.println(remove(input1,input2));
      //  System.out.println(occur(input1,input2));
        white(input1,input2);
    }
    public static String remove(String input1,String input2){
        StringBuilder s= new StringBuilder();
        char com=input2.charAt(0);
        for (int i = 0; i < input1.length(); i++) {
            char ch=input1.charAt(i);
            if(ch!=com){
                s.append(ch);
            }
        }
        return s.toString();
    }
    public static String occur(String input1,String input2){
        String s="";
        char com=input2.charAt(0);
        for (int i = 0; i < input1.length(); i++) {
            char ch=input1.charAt(i);
            if(ch!=com){
                s+=ch;
            }
        }
        return s;
    }
    public static void white(String s1,String s2){
        char ch;
        for (int i = 0; i < s1.length(); i++) {
            ch=s1.charAt(i);
            if(ch == 's'){
                continue;
            }
            System.out.print(ch);
        }
        System.out.println();
    }
}
