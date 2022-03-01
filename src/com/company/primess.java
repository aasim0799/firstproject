package com.company;

public class primess {
    public static void main(String[] args) {
        int n=200;
        p(n);
    }
    public static void p(int n){
        System.out.print(2+" ");
        System.out.print(3+" ");
        System.out.print(5+" ");
        System.out.print(7+" ");
        int i=10;
        while(i<n){
            if(i%2==0 || i%3==0 || i%5==0 || i%7==0){
                i++;
            }
            else{
                System.out.print(i+" ");
                i++;
            }
        }
//        2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97
        // 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199
    }
}
