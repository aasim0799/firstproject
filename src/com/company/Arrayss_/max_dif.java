package com.company.Arrayss_;

public class max_dif {
    public static void main(String[] args) {
        int arr[]={9,8,7,3,4,5,13,1};
        System.out.println(max(arr));
    }
    public static int  max(int arr[]){
        int max_di=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    max_di=Math.max(max_di,arr[j]-arr[i]);
                }
            }
        }
        return max_di;
    }
}
