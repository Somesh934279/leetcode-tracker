// Last updated: 7/9/2026, 9:48:29 AM
class Solution {
    public int repeatedNTimes(int[] nums) {
        Set<Integer> seen = new HashSet<>();

        for (int i : nums) {
            if (seen.contains(i))
                return i;
            seen.add(i);
        }
        return -1;
    }
}