package com.company;

public class statir {
    public static void main(String[] args) {
        printS(5," ");
    }
    public static void printS(int n,String res){
        if(n==0){
            System.out.println(res);
            return;
        }
        if(n-1>=0){
            printS(n-1,res+"1");
        }
         if(n-2>=0){
            printS(n-2,res+"2");
        }
         if(n-3>=0){
            printS(n-3,res+"3");
        }
    }
}
