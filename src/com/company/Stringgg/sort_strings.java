package com.company.Stringgg;

public class sort_strings {
    public static void main(String[] args) {
        String s="aasim momin";
        sort(s);
    }
    public static void sort(String s){
        char arr[] =s.toCharArray();
        char temp;
        for (int i = 0; i < arr.length; i++) {
            for(int j=i+1;j < arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(new String(arr));
    }
}
