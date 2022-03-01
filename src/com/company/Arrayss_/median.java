package com.company.Arrayss_;

import java.util.Arrays;

public class median {
    public static void main(String[] args) {
        int []arr1={900};
        int [] arr2={5, 8, 10, 20};

        median(arr1,arr2);

    }
    public static void median(int [] a,int [] b) {
        int [] c=new int[a.length+b.length];
        int i=0;
        int j=0;
        int k=0;
        while(i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k] = a[i];
                i++;
                k++;
            }
            else{
                c[k] = b[j];
                j++;
                k++;
            }
        }
        while (i < a.length) {
            c[k] = a[i];
            i++;
            k++;
        }
        while (j < b.length) {
            c[k] = b[j];
            j++;
            k++;
        }
        int start=0;
        int end=c.length-1;
        if(end%2 == 0) {
            int median=(start+end)/2;
            System.out.println(c[median]);
        }
        else{
            int sumi=start+end/2;
            int sum=(c[sumi]+c[sumi+1]) / 2;
            System.out.println(sum);
        }
    }
}
