package com.company;


public class bubly {
    public static void main(String[] args) {
           int [] arr={5,4,3,2,1};
        rotateKSteps2(arr,2);
    }
    public static void rotateKSteps2(int[] arr, int k) {
        k = k % arr.length;
        int nk = arr.length - k;
        reverseArray(arr, 0, nk - 1);
        reverseArray(arr, nk, arr.length - 1);
        reverseArray(arr, 0, arr.length - 1);
    }
    public static void reverseArray(int[] arr, int s, int e) {
        while (s <= e) {
            swap(arr, s, e);
            s++;
            e--;
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
