package com.company;

import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        int [] a={1,2,3,4,5};
        int [] b={6,7,8,9};
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter size");
//        int N = scan.nextInt();
//        int[] a = new int[N];
//        for (int i = 0; i < N; i++) {
//            a[i] = scan.nextInt();
//        }
//        System.out.println("Enter size");
//        int size = scan.nextInt();
//        int[] b = new int[size];
//        for (int i = 0; i < size; i++) {
//            b[i] = scan.nextInt();
//        }
        System.out.println(sumOfArray(a,b));
    }
    public static String sumOfArray(int[] a, int[] b) {
        int as = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[as] != 0) {
                break;
            }
            as++;
        }
        int bs = 0;
        for (int i = 0; i < b.length; i++) {
            if (b[bs] != 0) {
                break;
            }
            bs++;
        }
        int ai = a.length - 1;
        int bi = b.length - 1;
        String sum = "";
        int carry = 0;
        while (ai >= as && bi >= bs) {
            int currSum = a[ai] + b[bi] + carry;
            carry = currSum / 10;
            sum = (currSum % 10) + sum;
            ai--;
            bi--;
        }
        while (ai >= as) {
            int currSum = a[ai] + carry;
            carry = currSum / 10;
            sum = (currSum % 10) + sum;
            ai--;
        }
        while (bi >= bs) {
            int currSum = b[bi] + carry;
            carry = currSum / 10;
            sum = (currSum % 10) + sum;
            bi--;
        }
        if (carry != 0) sum = carry + sum;
        return sum;
    }

}
