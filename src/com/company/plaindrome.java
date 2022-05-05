package com.company;

public class plaindrome {
    public static void main(String[] args) {
        int number=11211;
        String s="" + number;
       // System.out.println(drome(s));
        palin(number);
    }
    public static boolean drome(String s) {
        String ss="";
        for (int i = s.length()-1; i >= 0; i--) {
            ss = ss + s.charAt(i);
        }
        return s.equals(ss);
    }
    public static void palin(int number) {
        int temp=number;
        int rev=0;
        int rem;
        while(temp != 0) {
            rem=temp%10;
            rev = rev*10+rem;
            temp=temp/10;
        }
        if (rev == number) {
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
