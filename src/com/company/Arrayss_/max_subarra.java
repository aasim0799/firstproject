package com.company.Arrayss_;

public class max_subarra {
    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(sub(arr));
    }
    public static int  sub(int arr[]){
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i]; //3
            if(max<sum) {
                max = sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return max;
    }
}
