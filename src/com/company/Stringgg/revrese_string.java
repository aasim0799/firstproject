package com.company.Stringgg;

public class revrese_string {
    public static void main(String[] args) {
        String s="aasim";
        System.out.println(reverse(s));
        rever(s);
        re(s);
    }
    public static String reverse(String s){
        if(s.length()==0) return "";
        return reverse(s.substring(1))+s.charAt(0);
    }
    public static void rever(String s){
        for(int i=s.length()-1;i>=0;i--){
            System.out.print(s.charAt(i));
        }
        System.out.println();
    }
    public static void re(String s){
        String a="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            a=ch+a;
        }
        System.out.print(a);
    }
}
