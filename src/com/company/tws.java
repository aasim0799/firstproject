package com.company;

public class tws {
    public static void main(String[] args) {
     int [] arr={9,6,4,2,3,5,7,0,1};
     int n=arr.length;//2
        System.out.println(need(arr,n));
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
