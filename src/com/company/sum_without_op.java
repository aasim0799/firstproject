package com.company;


public class sum_without_op {
    public static void main(String[] args) {
        int arr[]={1,2,3,5,6,7};
        System.out.println(getMissingNo(arr));
    }
    static int getMissingNo(int arr[])
    {
        int total = 1;
        for (int i = 2; i <= (arr.length + 1); i++)
        {
            total += i;
            total -= arr[i - 2];
        }
        return total;
    }

}
