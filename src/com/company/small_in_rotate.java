package com.company;

import java.util.Arrays;

public class small_in_rotate {
    public static void main(String[] args) {
        int arr[]={11,13,15,17};
        int rotate=3;
        for(int i=0;i<rotate;i++) {
            int last=arr[arr.length-1];
            for (int j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = last;
            System.out.println(Arrays.toString(arr));
        }

        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
