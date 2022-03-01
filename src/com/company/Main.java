package com.company;

public class Main {

    public static void main(String[] args) {
	int [] arr={4,5,6,8,10};
    int i=0;
    int j=arr.length-1;
    int temp=0;
     while(i<j){
         temp=arr[i];
         arr[i]=arr[j];
         arr[j]=temp;
         i++;
         j--;
     }
     for(int k=0;k<arr.length;k++){
         System.out.print(arr[k]+" ");
     }
    }
}
