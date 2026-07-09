// Last updated: 7/9/2026, 9:48:40 AM
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String reverseOnlyLetters(String s) {
       
        List<Character> letters = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                letters.add(c);
            }
        }

    
        int n = letters.size();
        for (int i = 0; i < n / 2; i++) {
            char temp = letters.get(i);
            letters.set(i, letters.get(n - 1 - i));
            letters.set(n - 1 - i, temp);
        }

        
        StringBuilder result = new StringBuilder();
        int letterIndex = 0;
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                result.append(letters.get(letterIndex++));
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
  
        Solution solution = new Solution();
        System.out.println(solution.reverseOnlyLetters("ab-cd")); 
        System.out.println(solution.reverseOnlyLetters("a-bC-dEf-ghIj"));
        System.out.println(solution.reverseOnlyLetters("Test1ng-Leet=code-Q!")); 
    }
}