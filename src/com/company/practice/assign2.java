package com.company.practice;
import java.util.*;
public class assign2 {
    public static void main(String[] args) {
//        Scanner scan=new Scanner(System.in);
//        int n=scan.nextInt();
//        int [] arr=new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=scan.nextInt();
//        }
//        ss(arr);


//        System.out.println(a);
    }
    public static void ss(int[] arr){
        int i=0;
        int count1=0;
        int count2=0;
        while(i < arr.length){
            for (int j = 0; j < arr.length; j++) {
                if(arr[j] > arr[i]){
                    count1++;
                }
                if(arr[j] < arr[i]){
                    count2++;
                }
            }
            if(count1 == count2) {
                System.out.println(arr[i]);
            }
            else{
                count1 = 0;
                count2 = 0;
            }
            i++;
        }
    }
}
