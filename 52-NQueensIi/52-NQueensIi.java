// Last updated: 7/9/2026, 9:51:46 AM
class Solution {
    public int totalNQueens(int n) {

        count = 0;
        char[][] arr = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = '.';
            }
        }
        nQueens(arr, 0);
        return count;
        
    }


    static int count = 0;

    public static boolean isSafe(char[][] arr, int row, int col) {

        // vertical up (column const)
        for (int i = row - 1; i >= 0; i--) {
            if (arr[i][col] == 'Q') {
                return false;
            }
        }

        // left diagonal (row -- , col --)
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (arr[i][j] == 'Q') {
                return false;
            }
        }

        // right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < arr.length; i--, j++) {
            if (arr[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public static void nQueens(char[][] arr, int row) {
        if (row == arr.length) {
            count++;
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (isSafe(arr, row, i)) {
                arr[row][i] = 'Q';
                nQueens(arr, row + 1);
                arr[row][i] = '.';
            }
        }

    }

    

    


    }