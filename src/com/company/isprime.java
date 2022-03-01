package com.company;

public class isprime {
    public static void main(String[] args) {
        System.out.println(prime(49));
    }
    public static boolean prime(int n){
        if(n <= 1){
            return false;
        }
        int c=2;
        while(c * c <= n){
            if (n%c==0){
                return false;
            }
            c++;
        }
        return c * c > n ;
    }
}
