package com.company.Stringgg;

import java.util.ArrayList;

public class print_subset {
    public static void main(String[] args) {
        String s="abc";
        String res="";
      //  printSubSeqRec(s,res);
        subsetAscii(s,res);
    }
    public  static  void printSubSeqRec(String s, String res) {
        if (s.length() == 0) {
            System.out.println(res);
            return;
        }
        char curr = s.charAt(0);

        printSubSeqRec(s.substring(1), res + curr);

        printSubSeqRec(s.substring(1), res);
    }
    public static void subsetAscii(String s,String ans) {
        if (s.length() == 0) {
            System.out.println(ans);
            return;
        }
        char ch=s.charAt(0);
        subsetAscii(s.substring(1),ans+ch);
        subsetAscii(s.substring(1),ans);
        subsetAscii(s.substring(1),ans+(ch+0));
    }
}
