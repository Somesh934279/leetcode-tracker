// Last updated: 7/9/2026, 9:50:47 AM
class Solution {
    public void moveZeroes(int[] nums) {
        int pos = 0;  // next non-zero position

        for (int num : nums) {
            if (num != 0) {
                nums[pos++] = num;
            }
        }

        // Fill remaining with zeroes
        while (pos < nums.length) {
            nums[pos++] = 0;
        }
    }
}