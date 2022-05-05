package com.company.Stringgg;

import java.util.ArrayList;

public class print_subset {
    public static void main(String[] args) {
        String s="";
        String res="abc";
      //  printSubSeqRec(s,res);
       // printSubSeq(s,res);
//        System.out.println(printSublist(s,res));
       // System.out.println(printSubSeqcount(s,res));
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
    public  static  void printSubSeq(String s, String res) {
        if (res.length() == 0) {
            System.out.println(s);
            return;
        }
        char curr = res.charAt(0);

        for (int i = 0; i <= s.length(); i++) {
            String first=s.substring(0,i);
            String second=s.substring(i,s.length());
            printSubSeq(first+curr+second,res.substring(1));
        }
    }
    public  static  ArrayList<String> printSublist(String s, String res) {
        if (res.length() == 0) {
            ArrayList<String> list=new ArrayList<>();
            list.add(s);
            return list;
        }
        char curr = res.charAt(0);

        ArrayList<String>  ans=new ArrayList<>();

        for (int i = 0; i <= s.length(); i++) {
            String first=s.substring(0,i);
            String second=s.substring(i,s.length());
            ans.addAll(printSublist(first+curr+second,res.substring(1)));
        }
        return ans;
    }
    public  static  int printSubSeqcount(String s, String res) {
        if (res.length() == 0) {
            return 1;
        }
        char curr = res.charAt(0);

          int count=0;

        for (int i = 0; i <= s.length(); i++) {
            String first=s.substring(0,i);
            String second=s.substring(i,s.length());
            count = count + printSubSeqcount(first+curr+second,res.substring(1));
        }
        return count;
    }
}
