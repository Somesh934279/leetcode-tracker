// Last updated: 7/9/2026, 9:47:00 AM
public class Solution {
    public char kthCharacter(int k) {
        // Start with the initial string "a"
        int length = 1; // Initial length of "a"
        int currentCharIndex = 0; // Index of the character in the string

        // Calculate the length of the string until it is at least k
        while (length < k) {
            length *= 2; // Each operation doubles the length
        }

        // Now we need to find the k-th character
        while (length > 1) {
            // If k is in the first half, we just need to find the character in the original string
            if (k <= length / 2) {
                // The character is in the first half
                length /= 2; // Reduce the length to the original string length
            } else {
                // If k is in the second half, we need to find the corresponding character in the first half
                k -= length / 2; // Adjust k to find the corresponding character
                // The character in the second half is the next character of the character in the first half
                // So we need to find the character in the first half and increment it
                length /= 2; // Reduce the length to the original string length
                // Increment the character
                currentCharIndex = (currentCharIndex + 1) % 26; // Increment the character index
            }
        }

        // The character at index 0 corresponds to 'a' + currentCharIndex
        return (char) ('a' + currentCharIndex);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int k1 = 5;
        System.out.println(solution.kthCharacter(k1)); // Output: "b"

        int k2 = 10;
        System.out.println(solution.kthCharacter(k2)); // Output: "c"
    }
}