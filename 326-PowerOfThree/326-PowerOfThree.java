// Last updated: 7/9/2026, 9:50:43 AM
class Solution {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPowerOfThree(27));  // true
        System.out.println(solution.isPowerOfThree(0));   // false
        System.out.println(solution.isPowerOfThree(9));   // true
        System.out.println(solution.isPowerOfThree(45));  // false
    }
}