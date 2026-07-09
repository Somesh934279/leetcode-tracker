// Last updated: 7/9/2026, 9:51:11 AM
public class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder columnTitle = new StringBuilder();
        
        while (columnNumber > 0) {
            
            columnNumber--; 
           
            char currentChar = (char) ('A' + (columnNumber % 26));
            
            columnTitle.append(currentChar);
            
            columnNumber /= 26;
        }
        
     
        return columnTitle.reverse().toString();
    }

    public static void main(String[] args) {
        // Test cases
        Solution solution = new Solution();
        System.out.println(solution.convertToTitle(1)); 
        System.out.println(solution.convertToTitle(28));  
        System.out.println(solution.convertToTitle(701)); 
        System.out.println(solution.convertToTitle(702)); 
        System.out.println(solution.convertToTitle(703)); 
    }
}