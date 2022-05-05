package com.company.practice;

public class diceface {
    public static void main(String[] args) {
        System.out.println(dice(3));
    }
    public static int dice(int number) {
        int num = 6-(number-1);
        return num;
    }
}
