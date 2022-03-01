package com.company.Stringgg;

import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        String a="listen";
        String b="silent";
        char arr[]=a.toCharArray();
        char brr[]=b.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(brr);
        String str=new String(arr);
        String str1=new String(brr);
        if(str.equals(str1)){
           // System.out.println("anagram");
        }
        else{
          //  System.out.println("not anagram");
        }
        String s1="aasim";
        String s2="momin";
        System.out.println(anagar(s1,s2));
    }
    public static boolean anagar(String s1,String s2){
        int [] count=new int[256];
        for(int i=0;i<s1.length();i++){
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }
        for(int i=0;i<count.length;i++){
            if(count[i]!=0){
                return false;
            }
        }
        return true;
    }
}
