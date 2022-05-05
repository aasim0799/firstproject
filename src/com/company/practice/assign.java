package com.company.practice;

import java.util.Scanner;

public class assign {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        String s=scan.next();
         game(num,s);
    }
    public static void game(int num,String s){
        int count1=0;
        int count2=0;
        int i=0;
        while(i<num){
            if(s.charAt(i) == 'N'){
                count1++;
            }
            else{
                count2++;
            }
            i++;
        }
        if(count1 > count2){
            System.out.println("Nutan");
        }
        else{
            System.out.println("Tusla");
        }
    }


}
