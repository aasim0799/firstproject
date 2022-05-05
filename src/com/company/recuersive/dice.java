package com.company.recuersive;

public class dice {
    public static void main(String[] args) {
        dicee("",4);
    }
    public static void dicee(String s,int target) {
        if (target == 0) {
            System.out.println(s);
            return;
        }
        for(int i=1;i<=6 && i <= target;i++) {
            dicee(s + i,target-i);
        }
    }
}
