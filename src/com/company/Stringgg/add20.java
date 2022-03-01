package com.company.Stringgg;

public class add20 {
    public static void main(String[] args) {
    String s="Mr John Smith";
       // System.out.println(spaces(s,"",0));
        //part(s);
        String a="pale";
        String b="bale";
        System.out.println(oneway(a,b));
    }
    public static String spaces(String s,String ans,int index) {
        if(index == s.length()) return ans;
            char ch=s.charAt(index);
            if (ch == ' ') {
                return spaces(s,ans+"%20",index+1);
            }
            else {
                return spaces(s,ans+ch,index+1);
        }
    }
    public static void part(String s) {
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if (ch == ' ') {
                System.out.print("%20");
            }
            else{
                System.out.print(ch);
            }
        }
    }
    public static boolean oneway(String a,String b) {
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        if (a.length() == b.length()) {
            int i=0;
            while(i < a.length()) {
                if (a.charAt(i) != b.charAt(i)) {
                    count1++;
                    i++;
                }
                else{
                    i++;
                }
            }
            if (count1 > 1) {
                return false;
            }
        }
        else {
            if (a.length() > b.length()) {
                count2 = a.length() - b.length();
            }
            else {
                count3 = b.length() - a.length();
            }
        }
        int noOfChanges=count1+count2+count3;
        if (noOfChanges > 1) {
            return false;
        }
        else {
            return true;
        }
    }
}
