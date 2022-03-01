package com.company;

public class somof {
    public static void main(String[] args) {
        String str1 = "12345";

        char[] c = str1.toCharArray();
        int sum = 0;
        for (int i = 0; i < c.length; i++) {
            int a=Character.getNumericValue(c[i]);
                sum = sum + a;
        }
//        System.out.println(sum);
        som(str1);
    }
    public static void som(String s){
        int ss=Integer.parseInt(s);
        int sum = 0;
        int input = ss;
        while (input != 0) {
            int lastdigit = input % 10;
            sum += lastdigit;
            input /= 10;
        }
        System.out.println(sum);
    }
}
