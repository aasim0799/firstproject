package com.company.Stringgg;

public class lengt {
    public static void main(String[] args) {
        String s="Hello World as";
        System.out.println(leng(s));
    }
    public static int leng(final String s){
        int lengt=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                lengt=0;
            }
            else{
                lengt++;
            }
        }
        return lengt;
    }
}
