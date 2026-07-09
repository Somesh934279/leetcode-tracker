// Last updated: 7/9/2026, 9:47:07 AM
class Solution {
    public int maxRepeating(String sequence, String word) {
        int k = 0;
        String curr = word;

        while (sequence.contains(curr)) {
            k++;
            curr += word;
        }

        return k;
    }
}