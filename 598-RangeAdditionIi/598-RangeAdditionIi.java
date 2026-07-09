// Last updated: 7/9/2026, 9:49:50 AM
class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        int min_row = m;
        int min_col = n;
        for (int i=0; i<ops.length; i++){
            if (ops[i][0]<min_row) min_row=ops[i][0];
            if (ops[i][1]<min_col) min_col=ops[i][1];
        }        
        return min_row*min_col;
        
    }
}