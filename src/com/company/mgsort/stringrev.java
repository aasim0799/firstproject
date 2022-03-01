package com.company.mgsort;

public class stringrev {
    public static void main(String[] args) {
        String ee="123450";
        System.out.println(rev(ee));
    }
    public static String  rev(String s){
        if(s.length()==0) return "";
        return rev(s.substring(1))+s.charAt(0);
    }


}
