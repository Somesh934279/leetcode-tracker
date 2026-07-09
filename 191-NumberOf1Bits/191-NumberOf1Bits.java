// Last updated: 7/9/2026, 9:51:06 AM
public class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        while (n > 0) {
            count += (n & 1); // Check if the LSB is set
            n >>= 1; // Right shift to check the next bit
        }
        return count;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Hamming weight of 11: " + solution.hammingWeight(11)); // Output: 3
        System.out.println("Hamming weight of 128: " + solution.hammingWeight(128)); // Output: 1
        System.out.println("Hamming weight of 2147483645: " + solution.hammingWeight(2147483645)); // Output: 30
    }
}