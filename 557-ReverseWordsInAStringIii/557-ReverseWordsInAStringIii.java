// Last updated: 7/9/2026, 9:49:59 AM
public class Solution {
    public String reverseWords(String s) {
        
        String[] words = s.split(" ");
        
        
        StringBuilder reversedSentence = new StringBuilder();
        
        
        for (String word : words) {
            String reversedWord = new StringBuilder(word).reverse().toString();
            reversedSentence.append(reversedWord).append(" ");
        }
        
   
        return reversedSentence.toString().trim();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        
        System.out.println(solution.reverseWords("Let's take LeetCode contest")); 
        System.out.println(solution.reverseWords("Mr Ding")); 
    }
}