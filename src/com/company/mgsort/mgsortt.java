package com.company.mgsort;
import java.util.Arrays;

public class mgsortt {
    public static void main(String[] args) {
        int [] a={4,5,6,23,45};
        int [] b={2, 4, 6, 8};
        int [] c=mergeTwoSortedArray(a,b);
        System.out.println(Arrays.toString(c));
       // System.out.println(Arrays.toString(mergeSort(a,0,a.length-1)));
    }

    public static int[] mergeSort(int[] arr, int l, int r) {
        if (l == r) {
            int[] c = new int[1];
            c[0] = arr[l];
            return c;
        }
        int mid = (l + r) / 2;
        int[] a = mergeSort(arr, l, mid);
        int[] b = mergeSort(arr, mid + 1, r);
        return mergeTwoSortedArray(a, b);
    }
    public static int[] mergeTwoSortedArray(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int ai = 0;
        int bi = 0;
        int k = 0;
        while (ai < a.length && bi < b.length) {
            if (a[ai] < b[bi]) {
                c[k] = a[ai];
                ai++;
                k++;
            } else {
                c[k] = b[bi];
                bi++;
                k++;
            }
        }
        while (ai < a.length) {
            c[k] = a[ai];
            ai++;
            k++;
        }
        while (bi < b.length) {
            c[k] = b[bi];
            bi++;
            k++;
        }
        return c;
    }
}
