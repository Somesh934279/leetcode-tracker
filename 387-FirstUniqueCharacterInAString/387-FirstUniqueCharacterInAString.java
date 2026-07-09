// Last updated: 7/9/2026, 9:50:33 AM
import java.util.HashMap;

public class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        
        
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        
        
        for (int i = 0; i < s.length(); i++) {
            if (charCount.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        
        return -1; 
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        
        System.out.println(solution.firstUniqChar("leetcode"));       
        System.out.println(solution.firstUniqChar("loveleetcode"));  
        System.out.println(solution.firstUniqChar("aabb"));          
        System.out.println(solution.firstUniqChar(""));              
        System.out.println(solution.firstUniqChar("abcabc"));        
    }
}