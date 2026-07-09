// Last updated: 7/9/2026, 9:50:54 AM
class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPowerOfTwo(1));   // true
        System.out.println(solution.isPowerOfTwo(16));  // true
        System.out.println(solution.isPowerOfTwo(18));  // false
        System.out.println(solution.isPowerOfTwo(1024)); // true
    }
}
