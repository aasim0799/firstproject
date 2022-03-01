package com.company.searches;

public class linea_sear {
    public static void main(String[] args) {
        int [] arr={48,98,78,65,34,45,54};
        System.out.println(linear(arr,45));
    }
    public static int linear(int [] arr,int n){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                return i+1;
            }
        }
        return -1;
    }
}
