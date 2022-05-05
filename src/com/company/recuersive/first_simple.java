package com.company.recuersive;

public class first_simple {
    public static void main(String[] args) {
        int n=302100021;
      //  firstt(n);
      //  second(n);
      //  System.out.println(third(n));
       // System.out.println(forth(n));
      //  System.out.println(digits(n));
//        System.out.println(edd(n));
//        System.out.println(dash(n,0));
        System.out.println(even(8,0));
    }
    public static void firstt(int n) {
        if(n==0) return;
        System.out.println(n);
          firstt(n-1);
    }
    public static void second(int n) {
        if(n==0) return;
        second(n-1);
        System.out.println(n);
    }
    public static int third (int n) {
        if (n == 1) return 1;
        return third(n-1) * n ;
    }
    public static int forth (int n) {
        if (n == 1)  return 1;
        return forth(n-1) + n;
    }
    public static int  digits(int n) {
        if (n == 0)  return 0;
        return digits(n / 10) + n % 10 ;
    }
    public static int dash(int n ,int c) {
        if (n == 0) {
            return c;
        }
        if (n % 10 == 0) {
           return dash(n/10,c+1);
        }
       return dash(n/10,c);
    }
    public static int even(int n, int step) {
        if (n == 0) return step;
        if (n%2 == 0) {
            return even(n/2,step+1);
        }
        return even(n-1,step+1);
    }
}
