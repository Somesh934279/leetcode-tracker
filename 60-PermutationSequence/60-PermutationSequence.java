// Last updated: 7/9/2026, 9:51:39 AM
class Solution {
    public String getPermutation(int n, int k) {
        // Step 1: Build the initial digits: "123...n"
        StringBuilder digits = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            digits.append(i);
        }

        // Step 2: Call the recursive function to build the answer
        return findKthPermutation(digits, k).toString();
    }

    private StringBuilder findKthPermutation(StringBuilder digits, int k) {
        // Base case: only one permutation possible
        if (k == 1 || k == 0) return digits;

        // Step 1: Find the largest factorial less than or equal to k
        int factorial = 1;
        int blockSize = 0; // blockSize = number of remaining positions to fill

        while (factorial < k) {
            blockSize++;
            factorial *= (blockSize + 1);
        }

        // Step back to previous valid factorial
        factorial /= (blockSize + 1);

        // Step 2: Figure out which digit to pick
        int groupEnd = factorial;
        int indexFromRight = blockSize;

        while (groupEnd < k) {
            indexFromRight--;
            groupEnd += factorial;
        }

        // Calculate index of digit to pick (from left)
        int indexToPick = digits.length() - 1 - indexFromRight;
        char selectedDigit = digits.charAt(indexToPick);

        // Remove the chosen digit
        digits.deleteCharAt(indexToPick);

        // Calculate new k for the smaller problem
        int newK = k - (groupEnd - factorial);

        // Step 3: If digits were removed from the middle, preserve prefix
        if (digits.length() != blockSize) {
            String prefix = digits.substring(0, digits.length() - blockSize); // fixed left part
            StringBuilder remainingDigits = new StringBuilder(digits.substring(digits.length() - blockSize)); // part to permute

            return new StringBuilder(prefix)
                    .append(findKthPermutation(remainingDigits, newK).insert(0, selectedDigit));
        }

        // Otherwise, directly recurse
        return findKthPermutation(digits, newK).insert(0, selectedDigit);
    }
}