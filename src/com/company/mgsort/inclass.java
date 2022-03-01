package com.company.mgsort;
import java.util.*;

public class inclass {
    public static void main(String[] args) {
//        Scanner scan=new Scanner(System.in);
//        int size=scan.nextInt();
//        String [] arr=new String[size];
//        for(int i=0;i<arr.length;i++){
//            arr[i]=scan.next();
//        }
//        System.out.println("sss");
          String [] arr={"geeksforgeeks","geeks","geek","geezer"};
//          String [] arr={"killer","filer","diller"};
//          String [] arr={"a","b","c","d"};
        Arrays.sort(arr);
//        [geek, geeks, geeksforgeeks, geezer]
        System.out.println(Arrays.toString(arr));
        System.out.print(pref(arr));
//        System.out.println(pref(arr));
    }
    public static String pref(String [] arr){
        int size=arr.length;
        if(size==0){
            return "1";
        }
        if(size==1){
            return arr[0];
        }
        Arrays.sort(arr);
        int end=Math.min(arr[0].length(),arr[size-1].length());
        int i=0;
        while(i<end && arr[0].charAt(i)==arr[size-1].charAt(i)){
            i++;
        }
        String pre=arr[0].substring(0,i);
        if(pre.length()==0){
            return "-1";
        }
        else{
            return pre;
        }
    }
}
