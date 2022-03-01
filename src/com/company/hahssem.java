package com.company;

import java.util.*;

public class hahssem {
    public static void main(String[] args) {
        String s1=new String("Aasim");
        String s2=new String("Momin");
        HashSet<Character> h1 = new HashSet<Character>(), h2 = new HashSet<Character>();
        for(int i = 0; i < s1.length(); i++)
        {
            h1.add(s1.charAt(i));
        }
        for(int i = 0; i < s2.length(); i++)
        {
            h2.add(s2.charAt(i));
        }
        h1.retainAll(h2);
        Character [] res=h1.toArray(new Character[0]);
        System.out.println(Arrays.toString(res));

        String x="Aasim has bat";
        String y="we play with bat of Aasim";
        fimd(Arrays.asList(x.split("has bat")),y);
        fimd(Arrays.asList(y.split("we play with bat of")),x);
    }
    public static void fimd(List<String>firstarr,String statement){
        for(String var:firstarr){
            if(statement.contains(var));
            System.out.println(var);
        }
    }
}
