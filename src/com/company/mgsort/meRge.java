package com.company.mgsort;

public class meRge {
    public static void main(String[] args) {
        printSubSeqRec("abc", "");

        }
    public static void printSubSeqRec(String s, String res) {
        if (s.length() == 0) {
            System.out.println(res);
            return;
        }
        char curr = s.charAt(0);
        //Accepting the curr character
        printSubSeqRec(s.substring(1), res + curr);
        //Rejecting the curr character.
        printSubSeqRec(s.substring(1), res);
    }
}


