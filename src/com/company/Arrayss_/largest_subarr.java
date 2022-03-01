package com.company.Arrayss_;

public class largest_subarr {
    public static void main(String[] args) {
        int arr[]={1,9,3,4,7,2,6,8};
        System.out.println(large(arr));
    }
    public static int large(int arr[]){
        int count=0;
        int max=Integer.MIN_VALUE;
        int maxcount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                count++;
            }
            else{
                max=arr[i];
                count=1;
            }
            if(maxcount < count){
                maxcount=count;
            }
        }
        return maxcount;
    }
}
