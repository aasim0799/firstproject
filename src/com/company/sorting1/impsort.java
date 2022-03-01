package com.company.sorting1;
import java.util.Arrays;

public class impsort {
    public static void main(String[] args) {
            int arr[]={0,1,0,0,2,1,0,2};
//           System.out.println(Arrays.toString(sort(arr)));
        //0, 0, 0, 0, 1, 1, 2, 2
        //0,0,0,0,2,2,1,1
      //  A1[] = {2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8}
        System.out.println(Arrays.toString(imp(arr)));
    }
    public static int [] sort(int [] arr){
        int count=1;//5
        int counter2=0;//2
        int counter3=0;//2
        for(int i=1;i<arr.length;i++){
            if(arr[i]==0){
                count++;
            }
            if(arr[i]==1){
                counter2++;
            }
            if(arr[i]==2){
                counter3++;
            }
        }
        int [] array=new int [arr.length];
        for(int k=0;k<count;k++){
            array[k]=0;
        }
        for(int j=count;j<count+counter2;j++){
            array[j]=2;
        }
        for(int l=count+counter2;l<count+counter2+counter3;l++){
            array[l]=1;
        }

        return array;
    }
    public static int [] imp(int arr[]){
        int count=0;
        int counter=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                count++;
            }
            if(arr[i]==1){
                counter++;
            }
        }
        for(int i=0;i<count;i++){
            arr[i]=0;
        }
        for(int j=count;j<count+counter;j++){
            arr[j]=1;
        }
        for(int k=count+counter;k<arr.length;k++){
            arr[k]=2;
        }
        return  arr;
    }

}
