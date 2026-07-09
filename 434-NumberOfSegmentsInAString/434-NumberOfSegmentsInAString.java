// Last updated: 7/9/2026, 9:50:22 AM
public class Solution {
    public int countSegments(String s) {
        // Trim the string to remove leading and trailing spaces
        s = s.trim();
        
        // If the string is empty after trimming, return 0
        if (s.isEmpty()) {
            return 0;
        }
        
        // Split the string by spaces
        String[] segments = s.split(" ");
        
        // Count non-empty segments
        int count = 0;
        for (String segment : segments) {
            if (!segment.isEmpty()) {
                count++;
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test cases
        System.out.println(solution.countSegments("Hello, my name is John")); // Output: 5
        System.out.println(solution.countSegments("Hello"));                   // Output: 1
        System.out.println(solution.countSegments("   "));                     // Output: 0
        System.out.println(solution.countSegments("  a b c  "));              // Output: 3
        System.out.println(solution.countSegments("a"));                       // Output: 1
        System.out.println(solution.countSegments(", , , ,        a, eaefa")); // Output: 2
    }
}