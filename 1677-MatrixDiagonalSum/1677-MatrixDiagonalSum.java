// Last updated: 7/9/2026, 9:47:08 AM
public class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length; 
        int sum = 0; 

        for (int i = 0; i < n; i++) {
           
            sum += mat[i][i];
            
            sum += mat[i][n - 1 - i];
        }

      
        if (n % 2 == 1) {
            sum -= mat[n / 2][n / 2];
        }

        return sum; 
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

       
        int[][] mat1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println(solution.diagonalSum(mat1)); 

        
        int[][] mat2 = {
            {1, 1, 1, 1},
            {1, 1, 1, 1},
            {1, 1, 1, 1},
            {1, 1, 1, 1}
        };
        System.out.println(solution.diagonalSum(mat2)); 

        
        int[][] mat3 = {
            {5}
        };
        System.out.println(solution.diagonalSum(mat3)); 
    }
}