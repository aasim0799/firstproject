package com.company.patterns;

import java.util.*;
import java.util.ArrayList;

public class practice {
    public static void main(String[] args) {
    String s="abcdefghijklmnopqrstuvwxyz";
       // System.out.println(recurrem(0,s,""));
      //  System.out.println(power(3,10));
        System.out.println(allchar(s));
    }
    public static void remove(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                continue;
            }
            else{
                System.out.print(s.charAt(i));
            }
        }
    }
   public static String recurrem(int i,String s,String ans) {
        if (i == s.length()) return ans;
        if (s.charAt(i) == 'a') {
           return  recurrem(i+1,s,ans);
        }
        else {
//            System.out.print(s.charAt(i));
            return recurrem(i + 1, s, ans + s.charAt(i));
        }
   }
         public static int power(int a, int b) {
        if (b < 0) {
            return 0;
        } else if (b == 0) {
            return 1;
        } else {
            return a * power(a, b - 1);
        }
    }
    public static boolean allchar(String str) {
        if (str.length() < 26) {
            return false;
        }
        boolean [] arr=new boolean[26];
        for(int i=0;i<str.length();i++) {
            char var=str.charAt(i);
            if(arr[var]) {
                return false;
            }
            arr[var] = true;
        }
        return true;
    }
}
