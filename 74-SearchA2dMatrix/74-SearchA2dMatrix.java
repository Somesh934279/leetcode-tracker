// Last updated: 7/9/2026, 9:51:32 AM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length - 1;
        int n = matrix[0].length - 1;
        
        // Approach 1: Start from top-right corner
        // int row = 0, col = n;
        // while (row <= m && col >= 0) {
        //     if (matrix[row][col] == target) {
        //         return true;
        //     } else if (matrix[row][col] > target) {
        //         col--;
        //     } else {
        //         row++;
        //     }
        // }
        // return false;

        // Approach 2: Start from bottom-left corner
        int row = m, col = 0;
        while (row >= 0 && col <= n) {
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] < target) {
                col++;
            } else {
                row--;
            }
        }
        return false;
    }
}