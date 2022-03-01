package com.company.hashmm;

import java.util.HashMap;

public class remove_using_map {
    public static void main(String[] args) {
        int arr[] = {7, 1, 2, 2, 6, 2, 3, 4, 5, 4, 6};
        //  remove(arr);
          String str[]={"aasim","aasim","jafar","jafar","momin","momin"};
         // removestr(str);
    }
    public static void remove(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.remove(arr[i]);
            }
            map.put(arr[i], i);
        }
        map.forEach((k, v) -> System.out.print(k + " "));
    }
    public static void removestr(Object [] arr){
        HashMap<Object,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.remove(arr[i]);
            }
            map.put(arr[i],i);
        }
        map.forEach((k,v) -> System.out.print(k+" "));
    }
}
