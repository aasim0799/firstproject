package com.company.patterns;

import java.util.Arrays;

public class star {
    public static void main(String[] args) {
        int n = 4;
//        for (int i = 0; i < n; i++) {
//            for(int j=0;j<n-i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int i=n-1;i>=0;i--){
//            for(int j=0;j<n-i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//          }}

//        triangle(4,0);
       // triangle2(0,0);
        int [] arr={10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
       // System.out.println(Arrays.toString(sort(arr)));
//       bubble(arr,arr.length-1,0);
       recurinser(arr,0,1);
        System.out.println(Arrays.toString(arr));
    }
    public static void triangle(int r,int c) {
        if (r == 0) return;
        if(c < r) {
            System.out.print("*");
            triangle(r,c+1);
        }
        else {
            System.out.println();
            triangle(r-1,0);
        }
    }
    public static void triangle2(int r,int c) {
        if (r >= 4) return;
        if (c <= r) {
            System.out.print("*");
            triangle2(r,c+1);
        }
        else{
            System.out.println();
            triangle2(r+1,0);
        }
    }
    public static int [] sort(int [] arr) {
        for(int i=0;i<arr.length;i++) {
            for (int j=0;j < arr.length-1;j++) {
                if (arr[j] > arr[j+1]) swap(arr,j,j+1);
            }
        }
        return arr;
    }
    public static void swap(int[] arr,int i,int j) {
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void bubb(int [] arr,int n) {
          if (n == 0) return;
          for(int j=0;j<n;j++) {
              if (arr[j] > arr[j+1]) {
                  swap(arr,j,j+1);
              }
          }
          bubb(arr,n-1);
        }
        public static void bubble(int [] arr,int r,int c) {
        if (r == 0) return;
        if (c < r) {
            if (arr[c] > arr[c+1]) {
                swap(arr,c,c+1);
            }
            bubble(arr,r,c+1);
        }
        else{
            bubble(arr,r-1,0);
        }
        }

          public static void select(int [] arr) {
           for (int i=0;i<arr.length-1;i++) {
               int minindex=i;
               for(int j=i+1;j<arr.length;j++) {
                   if (arr[minindex] > arr[j])
                        minindex=j;
               }
               swap(arr,i,minindex);
           }
          }
          public static void insert(int [] arr) {
        for(int i=0;i<arr.length-1;i++) {
            for(int j=i+1;j>0;j--) {
                if(arr[j] < arr[j-1])
                    swap(arr,j,j-1);
                else break;
            }
            System.out.println(Arrays.toString(arr));
        }
          }
          public static void recursel(int [] arr,int i,int j) {
          if (i == arr.length-1) return;
          int minindex=i;
          if (j < arr.length) {
              if(arr[j] < arr[minindex]) {
                  minindex=j;
              }
              recursel(arr,i,j+1);
          }
              swap(arr,i,minindex);
              recursel(arr,i+1,i+1);
          }
        public static void recurinser(int [] arr,int i,int j) {
        if (i == arr.length) return;
        if (j > 0) {
            if (arr[j] < arr[j-1]) {
                swap(arr,j,j-1);
            }
            recurinser(arr,i,j-1);
        }
        recurinser(arr,i+1,i+1);
        }
    }

