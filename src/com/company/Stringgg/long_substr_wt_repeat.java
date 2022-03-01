package com.company.Stringgg;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class long_substr_wt_repeat {
    public static void main(String[] args) {
        String s="abbac";
       // substr(s);
      //  System.out.println(sub(s));
        System.out.println(withour(s));
    }
    public static void substr(String s){
        String longest=null;
        int length=0;
        char [] arr=s.toCharArray();
        Map<Character,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<arr.length;i++){
            char ch=arr[i];
            if(!map.containsKey(ch)){
                map.put(ch,i);
            }
            else{
                i=map.get(ch);
                map.clear();
            }
            if(map.size() > length){
                length= map.size();
                longest=map.keySet().toString();
            }
        }
        System.out.println(length);
        System.out.println(longest);
    }
    public static int sub(String s) {
        String empt = "";
        int length = 0;
        for (char variable : s.toCharArray()) {
            String curr = String.valueOf(variable);
            if (empt.contains(curr)) {
                empt = empt.substring(empt.indexOf(curr) + 1);
            }
            empt = empt + String.valueOf(variable);
            length = Math.max(empt.length(), length);
        }
        return length;
    }
    public static String withour(String s){
        HashSet<Character> set=new HashSet<>();
        String longest="";
        String overall="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(set.contains(ch)){
                overall="";
                set.clear();
            }
            set.add(ch);
            overall+=ch;
            if(overall.length() > longest.length()){
                longest=overall;
            }
        }
        return longest;
    }
}
