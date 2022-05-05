package com.company.recuersive;

import java.util.ArrayList;

public class subste {
    public static void main(String[] args) {
        String p="";
        String up="123";
        subsetPhone(p,up);
//        System.out.println(subusinglist(p,up));
//        System.out.println(subsetcount(p,up));
    }
    public static void subsetPhone(String p,String up) {
        if (up.length() == 0) {
            System.out.println(p);
            return;
        }
        int number=up.charAt(0) - '0';

        for (int i=(number-1)*3;i < number * 3;i++) {
            char ch = (char) ('a' + i);
            subsetPhone(p+ch,up.substring(1));
        }
    }
    public static ArrayList<String> subusinglist(String p,String up) {
        if (up.length() == 0) {
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        int number=up.charAt(0) - '0';
        ArrayList<String> list=new ArrayList<>();

        for (int i=(number-1)*3;i<number*3;i++) {
            char ch=(char)('a'+i);
           list.addAll(subusinglist(p+ch,up.substring(1)));
        }
        return list;
    }


    public static int subsetcount(String p,String up) {
        if (up.length() == 0) {
            return 1;
        }
        int number = up.charAt(0) - '0';
        int count=0;

        for (int i = (number - 1) * 3; i < number * 3; i++) {
            char ch = (char) ('a' + i);
            count = count  + subsetcount(p + ch, up.substring(1));
        }
        return count;
    }
}
