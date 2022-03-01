package com.company.Stringgg;

import java.util.Arrays;

public class zeross {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getNoZeroIntegers(11)));
    }
    public static int[] getNoZeroIntegers(int n) {
        for (int i = 1; i < n; ++ i) {
            int a = i;
            int b = n - a;
            if (nozeros(a) && nozeros(b)) {
                return new int [] {a,b};
            }
        }
        return null;
    }

    public static boolean nozeros(int x) {
        while (x > 0) {
            if (x % 10 == 0) return false;
            x=x/10;
        }
        return true;
    }

}
