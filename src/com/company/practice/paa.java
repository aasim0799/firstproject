package com.company.practice;

public class paa {
    public static void main(String[] args) {
        int number=121;
        System.out.println(p(number,0,number));
    }
    public static boolean p(int number,int remainder,int original) {
        if (number == 0) {
            return remainder == original;
        }
        return  p(number / 10,remainder * 10 + number % 10,original);
        }
}
