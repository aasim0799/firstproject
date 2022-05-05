package com.company.recuersive;

import java.util.ArrayList;
import java.util.Arrays;

public class ratmaze {
    public static void main(String[] args) {
        //System.out.println(ratcount(3,3));
       // maze("",3,3);
        int[][] arr = {{1, 0, 0, 0},
                       {1, 1, 0, 1},
                       {1, 1, 0, 0},
                       {0, 1, 1, 1}};
        //printRatInAMaze(arr, 0, 0, "");
      //  System.out.println();
        //pathRestriction(arr,0,0,"");
//        pathsall(arr,0,0,"");
      // pathsNormalall(arr,0,0,"");
       //System.out.println(pathsallusinglist(arr,0,0,""));
        System.out.println(printRatInAMaze(arr,0,0,""));
    }
    static int ratcount(int r,int c) {
        if (r == 1 || c == 1) {
            return 1;
        }
        int left =ratcount(r-1,c);
        int right=ratcount(r,c-1);

        return left+right;
    }
    public static void maze(String s,int r,int c) {
        if (r == 1  && c == 1) {
            System.out.println(s);
            return;
        }
        if (r > 1) {
            maze(s+"D",r-1,c);
        }
        if (c > 1) {
            maze(s+"R",r,c-1);
        }
    }

    public static int[][] dir = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
    public static char[] dirChar = {'U', 'R', 'D', 'L'};


    public static ArrayList<String> printRatInAMaze(int[][] m, int r, int c, String psf) {
        if (r == m.length - 1 && c == m[0].length - 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(psf);
            return list;
        }
        ArrayList<String> list=new ArrayList<>();
        m[r][c] = 0;
        for (int i = 0; i < dir.length; i++) {
            int dr = dir[i][0];
            int dc = dir[i][1];
            int nr = dr + r;
            int nc = dc + c;
            if (nr >= 0 && nr < m.length && nc >= 0
                    && nc < m[0].length && m[nr][nc] == 1) {
                list.addAll(printRatInAMaze(m, nr, nc, psf + dirChar[i]));
            }
        }
        m[r][c] = 1;
        return list;
    }
    public static void pathRestriction(int [][]mat,int r,int c,String s) {
        if (r == mat.length-1 && c == mat[0].length-1) {
            System.out.println(s);
            return;
        }

        if (mat[r][c] == 0) {
            return;
        }

        if (r < mat.length-1) {
        pathRestriction(mat,r+1,c,s+"D");
        }
        if (c < mat[0].length-1) {
            pathRestriction(mat,r,c+1,s+"R");
        }
    }
    public static void pathsNormalall(int [][]mat, int r, int c, String s) {
        if (r == mat.length-1 && c == mat[0].length-1) {
            System.out.println(s);
            return;
        }


        if (mat[r][c] == 0) {
            return;
        }
        mat[r][c] = 0;

        if (r < mat.length-1) {
            pathsNormalall(mat,r+1,c,s+"D");
        }
        if (c < mat[0].length-1) {
            pathsNormalall(mat,r,c+1,s+"R");
        }
        if (r > 0) {
            pathsNormalall(mat,r-1,c,s+"U");
        }
        if (c > 0) {
           pathsNormalall(mat,r,c-1,s+"L");
        }
        mat[r][c] = 1;
    }



    public static ArrayList<String> pathsallusinglist(int [][]mat, int r, int c, String s) {
        if (r == mat.length-1 && c == mat[0].length-1) {
            ArrayList<String> list=new ArrayList<>();
            list.add(s);
            return list;
        }

        ArrayList<String> list=new ArrayList<>();

        if (mat[r][c] == 0) {
            return list;
        }
        mat[r][c] = 0;

        if (r < mat.length-1) {
            list.addAll(pathsallusinglist(mat,r+1,c,s+"D"));
        }
        if (c < mat[0].length-1) {
            list.addAll(pathsallusinglist(mat,r,c+1,s+"R"));
        }
        if (r > 0) {
            list.addAll(pathsallusinglist(mat,r-1,c,s+"U"));
        }
        if (c > 0) {
            list.addAll(pathsallusinglist(mat,r,c-1,s+"L"));
        }
        mat[r][c] = 1;
        return list;
    }
}
