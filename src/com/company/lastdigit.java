package com.company;

import java.util.Arrays;

public class lastdigit {
    public static void main(String[] args) {
        String s="yahoo";
        char[] c=s.toCharArray();
        Arrays.sort(c);
        int count=0;
        for(int i=0;i<c.length-1;i++){
             count=1;
            if(c[i]==c[i+1]){
                count++;
            }
        }
        System.out.println(count+" ");
    }
}
