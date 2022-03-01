package com.company;

import java.util.Scanner;

public class min {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int row=scan.nextInt();
        int col=scan.nextInt();
        printMazePath(0,0,row-1,col-1," ");
    }
        public static void printMazePath(int sr, int sc, int dr, int dc, String res) {
            if (sr == dr && sc == dc) {
                System.out.println(res);
                return;
            }
            if (sc + 1 <= dc) {
                printMazePath(sr, sc + 1, dr, dc, res + "H");
            }
            if (sr + 1 <= dr) {
                printMazePath(sr + 1, sc, dr, dc, res + "V");
            }
        }

}
