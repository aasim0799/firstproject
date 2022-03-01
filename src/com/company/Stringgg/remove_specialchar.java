package com.company.Stringgg;

public class remove_specialchar {
    public static void main(String[] args) {
        String s="$ja&va!pro&gr@am";
        str(s);
    }
    public static void str(String s){
        char ch;
        for(int i=0;i<s.length();i++){
            ch=s.charAt(i);
            if(ch !='$' && ch != '&' && ch != '!' && ch !='@'){
                System.out.print(ch+"");
            }
        }
    }
}
