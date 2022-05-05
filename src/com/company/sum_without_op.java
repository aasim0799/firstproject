package com.company;


public class sum_without_op {
    public static void main(String[] args) {
        int arr[]={0,1,2,3,5,6,7};
//        System.out.println(getMissingNo(arr));
        System.out.println(need(arr,arr.length-1));
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

    public static int need(int [] arr,int n){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        int find=(n+1)*(n+2)/2;
        int sol=find-sum;
        return sol;
    }

}
