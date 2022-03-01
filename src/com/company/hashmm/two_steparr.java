package com.company.hashmm;

public class two_steparr {
    public static void main(String[] args) {
        System.out.println(steps(3));

        System.out.println(one(2));
    }
    public static int steps(int n){
        if(n==0) return 1;
        if(n<0) return 0;
        int onestep=steps(n-1);
        int twosteps=steps(n-2);
        return onestep+twosteps;
    }
    public static int one(int n){
        if(n == 0)  return 1;
        if(n < 0)  return 0;
        int onestep=one(n-1);
        int tostep=one(n-2);
        return onestep+tostep;
    }
}
