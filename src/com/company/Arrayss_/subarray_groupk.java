package com.company.Arrayss_;

public class subarray_groupk {
    public static void main(String[] args) {
        int arr[]={1, 4, 2, 10, 23, 3, 1, 0, 20};
        System.out.println(sub(arr,2,arr.length));
        System.out.println(arry(arr,2));
    }
    public static int sub(int arr[],int k,int N){
        int sum=0;
        int max=Integer.MIN_VALUE;
        if (arr.length < k) {
            return -1;
        }
        for(int i=0;i<=arr.length-k;i++){
                sum=arr[i];
            for(int j=i+1;j<i+k;j++){
                sum=sum+arr[j];
            }
            if(sum>max){
                max=sum;
            }
        }
        return max;
    }
    public static int arry(int arr[],int k){
        int sum=0;
        int start=0;
        int max=0;
        for(int end=0;end<arr.length;end++){
            sum=sum+arr[end];
            if(end >= k-1){
                max=Math.max(sum,max);
                sum=sum-arr[start];
                start++;
            }
        }
        return max;
    }
}
