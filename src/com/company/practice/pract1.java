package com.company.practice;

public class pract1 {
    public static void main(String[] args) {
        String s = "mozzila";
        pr(s);
        System.out.println(p1(s));
        System.out.println(p2(s));
    }
        public static void pr(String s){
            if (s.startsWith("zilla")) {
                System.out.println(("Found zilla!"));
            } else {
                System.out.println(("No zilla here!"));
            }
        }
        public static boolean p1(String s) {
            if (s.contains("la")) {
                return true;
            } else {
                return false;
            }
        }
        public static boolean p2(String s) {
        if (s.endsWith("la")) {
            return true;
        }
        else{
            return false;
        }
        }

}
