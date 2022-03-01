package com.company;

import java.util.HashMap;
import java.util.Set;

public class firs_posit {
    public static void main(String[] args) {
        HashMap<String,String> var=new HashMap<>();
        var.put("aasim","77099");
        var.put("jafar","98900");
        var.put("mumtaj","738548");
        System.out.println(var.get("jafar"));
        Set<String> variable=var.keySet();
        for(String i:variable){
            System.out.println(i+":"+var.get(i));
        }

    }
}
