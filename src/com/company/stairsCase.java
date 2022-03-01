package com.company;
import java.util.*;

public class stairsCase {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int n=scan.nextInt();
        printStairPath(n,"");
    }
    public static void printStairPath(int n, String res) {
        if (n == 0) {
            System.out.println(res);
            return;
        }
        if (n - 1 >= 0) {
            printStairPath(n - 1, res + "1");
        }
        if (n - 2 >= 0) {
            printStairPath(n - 2, res + "2");
        }
        if (n - 3 >= 0) {
            printStairPath(n - 3, res + "3");
        }
    }
}
