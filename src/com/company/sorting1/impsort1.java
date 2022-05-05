package com.company.sorting1;

import java.util.*;

public class impsort1 {
    public static void main(String[] args) {
//        Scanner scan=new Scanner(System.in);
//        int bar=scan.nextInt();
//        int [] arr=new int[bar];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i]=scan.nextInt();
//        }
//        jump(arr);
        System.out.println("aas");
    }
    public static void jump(int [] arr){
        double total=0;
        double sum;
        for(int i=0;i<arr.length;i++){
             sum=Math.sqrt(arr[i]);
            if(sum%1 == 0){
                total+=sum;
            }
        }
        System.out.println((int)total);
    }

}
