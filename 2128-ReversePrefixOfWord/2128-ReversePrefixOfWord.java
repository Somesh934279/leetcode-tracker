// Last updated: 7/9/2026, 9:47:01 AM
public class Solution {
    public String reversePrefix(String word, char ch) {
        
        int index = word.indexOf(ch);
        
       
        if (index == -1) {
            return word;
        }
        
        
        String segmentToReverse = word.substring(0, index + 1);
        String reversedSegment = new StringBuilder(segmentToReverse).reverse().toString();
        
        
        String remainingPart = word.substring(index + 1);
        
       
        return reversedSegment + remainingPart;
    }

    public static void main(String[] args) {
        
        Solution solution = new Solution();
        
      
        System.out.println(solution.reversePrefix("abcdefd", 'd')); 
        System.out.println(solution.reversePrefix("xyxzxe", 'z'));  
        System.out.println(solution.reversePrefix("abcd", 'z'));   
    }
}