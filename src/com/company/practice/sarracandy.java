package com.company.practice;

import java.util.Scanner;

public class sarracandy {
    public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      int n=scan.nextInt();
      int x=scan.nextInt();
      int y=scan.nextInt();
        System.out.println(candy(n,x,y));
    }
    public static int candy(int N, int X, int Y){
        if(N%2 == 0) {
            if(X%2 == 0 && Y%2 == 0){
                return 1;
            }
            if(X%2 == 0 || Y%2 == 0){
                return 0;
            }
        }
        else{
            if(X%2 == 0 && Y%2 == 0){
                return 0;
            }
            if(X%2 == 0 || Y%2 == 0){
                return 1;
            }
        }
        return 0;
    }
}
