// Last updated: 7/9/2026, 9:48:54 AM
public class Solution {
    public int[][] transpose(int[][] matrix) {
        int m = matrix.length; // Number of rows
        int n = matrix[0].length; // Number of columns
        int[][] transposed = new int[n][m]; // Create a new matrix for the transpose

        // Fill the transposed matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transposed[j][i] = matrix[i][j]; // Swap indices
            }
        }

        return transposed; // Return the transposed matrix
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[][] result1 = solution.transpose(matrix1);
        printMatrix(result1); // Output: [[1, 4, 7], [2, 5, 8], [3, 6, 9]]

        // Test case 2
        int[][] matrix2 = {
            {1, 2, 3},
            {4, 5, 6}
        };
        int[][] result2 = solution.transpose(matrix2);
        printMatrix(result2); // Output: [[1, 4], [2, 5], [3, 6]]
    }

    // Helper method to print the matrix
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.print("[");
            for (int i = 0; i < row.length; i++) {
                System.out.print(row[i]);
                if (i < row.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }
}
