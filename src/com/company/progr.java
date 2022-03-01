package com.company;

import java.util.Arrays;

public class progr {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
//        incre(array,3);
        increase(array,3);
    }

//    public static int[] append(int[] array, int value) {
//        int[] result = Arrays.copyOf(array, array.length + 1);
//        result[result.length - 1] = value;
//        return result;
//    }
    public static  void incre(int [] array,int value){
        int [] res=Arrays.copyOf(array,array.length+1);
        res[res.length-1]=value;
        System.out.println(res);
    }
    public static void increase(int[] arr,int add){
        int [] array=new int[arr.length+1];
        int j=0;
        int k=0;
        while(j<array.length && k<arr.length){
                array[j]=arr[k];
                k++;
                j++;
        }
        while(j<array.length){
            array[j]=add;
            j++;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
}

