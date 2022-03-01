package com.company;

import java.util.*;

public class tic_tac_toe {
    public static void main(String[] args) {
        char a,b;
        Scanner scan=new Scanner(System.in);
        a=scan.next().charAt(0);
        b=scan.next().charAt(0);
        if(a=='R' || b=='R'){
            System.out.println("R");
        }
        else if(a=='J'|| b=='J'){
            if(a=='J'){
                System.out.println(b);
            }
            else{
                System.out.println(a);
            }
        }
        else{
            System.out.println("D");
        }
    }
}
