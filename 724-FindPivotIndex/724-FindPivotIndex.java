// Last updated: 7/9/2026, 9:49:29 AM
class Solution {
    public int pivotIndex(int[] nums) {
        // calculate total sum
        int totalSum = 0;
        for (int num : nums) totalSum += num;
        int leftSum = 0; // keep track of sum on the left
        // loop and check pivot condition
        for (int i = 0; i < nums.length; i++) {
            // Right sum formula
            int rightSum = totalSum - leftSum - nums[i];
            if (leftSum == rightSum) return i; // found pivot
            leftSum += nums[i]; // Move curr element to left side
        }

        return -1; // No pivot found
    }
}