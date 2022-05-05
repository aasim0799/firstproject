package com.company.backtracking;

public class pseduco_solver {
    public static void main(String[] args) {
        char [][]sudoku =
                        {{'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                        {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                        {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                        {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                        {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                        {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                        {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                        {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                        {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
        solveSudoku(sudoku, 0);
        display(sudoku);

    }
    public static boolean canElementBePlaced(char[][] board, int r, int c, char k) {
        for (int i = 0; i < 9; i++) {
            if (board[r][i] == k) return false;
        }
        for (int i = 0; i < 9; i++) {
            if (board[i][c] == k) return false;
        }
        int sr = r - (r % 3);
        int sc = c - (c % 3);
        for (int i = sr; i <= sr + 2; i++) {
            for (int j = sc; j <= sc + 2; j++) {
                if (board[i][j] == k) return false;
            }
        }
        return true;
    }
    public static boolean solveSudoku(char[][] board, int total) {
        if (total == 81) {
            return true;
        }
        int r = total / 9;
        int c = total % 9;
        if (board[r][c] != '.') return solveSudoku(board, total + 1);
        for (int i = 1; i <= 9; i++) {
            char k = (char) (i + '0');
            if (canElementBePlaced(board, r, c, k)) {
                board[r][c] = k;
                if (solveSudoku(board, total + 1)) return true;
                board[r][c] = '.';
            }
        }
        return false;
    }
    public static void display(char [][]board) {
        for (int i = 0; i < 9; i++) {
            for(int j=0;j<9;j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
}
