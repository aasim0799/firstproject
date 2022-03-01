package com.company.Arrayss_;

import java.util.Arrays;

public class product_exception {
    public static void main(String[] args) {
        int arr[]={4,2,1,7};
       // pro(arr);
        System.out.println(Arrays.toString(using_divi(arr)));
    }
    public static void pro(int arr[]){
        int sum=1;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.print(" ");
                }
                else{
                    sum=sum*arr[j];
                }
            }
            System.out.print(sum);
            sum=1;
        }
    }
    public static int[]  using_divi(int arr[]){
        int product=1;
        int ans[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            product=product*arr[i];
        }
        for(int i=0;i<arr.length;i++){
            ans[i]=product/arr[i];
        }
        return ans;
    }
}
