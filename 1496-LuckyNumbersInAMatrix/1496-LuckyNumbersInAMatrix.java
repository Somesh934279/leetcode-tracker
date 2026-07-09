// Last updated: 7/9/2026, 9:47:33 AM
class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> nums = new ArrayList<>();
        for(int row=0;row<matrix.length;row++){
            int min=Integer.MAX_VALUE;
            int max=Integer.MIN_VALUE;
            int col=0;
            for(int i=0;i<matrix[0].length;i++){
                if(matrix[row][i]<min){
                    min=matrix[row][i];
                    col=i;
                }
            }
            for(int i=0;i<matrix.length;i++){
                if(matrix[i][col]>max){
                    max=matrix[i][col];
                }
            }
            if(min==max)
                nums.add(min);
        }
        return nums;
    }
}