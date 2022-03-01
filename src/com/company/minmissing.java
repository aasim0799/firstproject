package com.company;

import java.util.Arrays;

public class minmissing {
    public static void main(String[] args) {
        int arr[] = {2, 1, 3, -10, -8, 29};
        System.out.println(missing(arr));
    }

    public static int missing(int[] arr) {
        int i = 0;
        while(i < arr.length) {
            if(arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[arr[i] - 1]) {
                int otherIndex = arr[i] - 1;

                int x = arr[i];
                arr[i] = arr[otherIndex];
                arr[otherIndex] = x;
            } else {
                i++;
            }
        }

        for(i = 0; i < arr.length; i++) {
            if(arr[i] != i + 1) {
                return i + 1;
            }
        }

        return arr.length + 1;
    }
}