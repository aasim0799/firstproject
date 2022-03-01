package com.company.recuersive;

import java.util.ArrayList;
import java.util.LinkedList;

public class second {
    public static void main(String[] args) {
        int[] arr = {1, 2, 8 , 16, 32};
        //System.out.println(array2(arr,10,0));
        // System.out.println(finish(arr,16,0));
    }
    public static boolean array(int []arr,int num) {
        if (num == arr.length-1) return true;

        if(arr[num] < arr[num+1]) {
          return   array(arr,num+1);
        }
        return false;
    }
    public static boolean array2(int [] arr,int target,int num) {
        if (arr[num]  == target) return  true;
        if(num >= arr.length-1) return false;
        return array2(arr,target,num+1);
    }

       static ArrayList<Integer> list=new ArrayList<>();
     static void array3(int [] arr,int target,int index) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        array3(arr,target,index+1);
    }

    static ArrayList<Integer> finish(int [] arr, int target, int index, ArrayList<Integer> fist) {
         if (index == arr.length) {
             return fist;
         }
         if (arr[index] == target) {
             fist.add(index);
         }
         return  finish(arr,target,index+1,fist);
    }


    static ArrayList<Integer> finish(int [] arr, int target, int index) {
         ArrayList<Integer> fist =new ArrayList<Integer>();
        if (index == arr.length) {
            return fist;
        }
        if (arr[index] == target) {
            fist.add(index);
        }
        ArrayList<Integer> find =  finish(arr,target,index+1);

        fist.addAll(find);
        return fist;
    }
}
