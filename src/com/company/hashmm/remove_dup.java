package com.company.hashmm;

import java.util.Arrays;

public class remove_dup {
    public static void main(String[] args) {
        String [] str={"aasim","aasim","jafar","jafar","momin","momin"};
         remo(str);
        int  arr[] = {1,1,2,2,3,4,5,5};
       // remoo(arr);
    }
    public static void remoo(int [] arr){
    int  leng=arr.length;
    int array[]=new int[leng];
    int j=0;
        for(int i=0;i<arr.length-1;i++){
        if(arr[i]!=(arr[i+1])){
            array[j++]=arr[i];
        }
    }
    array[j++]=arr[leng-1];
        for(int k=0;k<j;k++) {
        System.out.print(array[k] + " ");
    }
}
    public static void remo(Object [] object){
        int  leng=object.length;
        Object a []=new Object[leng];
        int j=0;
        for(int i=0;i<object.length-1;i++){
            if(object[i]!=(object[i+1])){
                a[j++]=object[i];
            }
        }
        a[j++]=object[leng-1];
        for(int k=0;k<j;k++) {
            System.out.print(a[k] + " ");
        }
    }
}
