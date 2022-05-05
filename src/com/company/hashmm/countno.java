package com.company.hashmm;

public class countno {
    public static void main(String[] args) {
        int []arr={22,456,24,553,244,5,5555};
        System.out.println(cou(arr));
    }
    public static int  cou(int [] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(even(arr[i])){
                count++;
            }
        }
        return count;
    }
    public static boolean even(int num){
        if(count(num)%2==0){
            return true;
        }
        else{
            return false;
           }
        }
    public static int count(int num){
        int count=0;
        while (num>0){
            count++;
            num=num/10;
        }
        return count;
    }
}
