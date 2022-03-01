package com.company.Stringgg;

import java.util.Arrays;

public class Sb {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
           char ch = (char) ('a' + i);
           builder.append(ch);
        }
        System.out.println(builder);
//        builder.append("aasim");
//        builder.append(" ");
//        builder.append("momin");
//        builder.reverse();
//        System.out.println(builder);
//        System.out.println(builder.capacity());
//        String str = "aasim momin";
//        System.out.println(Arrays.toString(str.toCharArray()));
    }
}
