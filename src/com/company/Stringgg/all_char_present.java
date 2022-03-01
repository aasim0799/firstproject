package com.company.Stringgg;

public class all_char_present {
    public static void main(String[] args) {
        String s="abcdefghijklmnopqrstuvwxyz";
        System.out.println(all(s));
    }
    public static boolean all(String s) {
        if (s.length() < 26) {
            return false;
        }
        boolean [] arr=new boolean[26];
        for (int i = 0;  i < s.length();  i++) {
            char ch = s.charAt(i);
            int val = ch - 'a';
            arr[val] = true;
        }
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i]) {
                return false;
            }
        }
        return true;
    }
}
