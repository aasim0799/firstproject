package com.company;

public class missing_Num {
    public static void main(String[] args) {
        String str="aasim";
        System.out.println(stt(str));
        strr(str,stt(str));
    }
    public static String stt(String s){
        if(s.length()==0) return "";
         String res=stt(s.substring(1))+s.charAt(0);
         String var=res;
         return var;
    }
    public static void strr(String s,String var){
        if(var.equals(s)){
            System.out.println("Plaindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }

}
