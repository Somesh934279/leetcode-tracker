// Last updated: 7/9/2026, 9:49:42 AM
class Solution {
    int count=0;
    public int countSubstrings(String s) {
        int i = 0;
        while (i <= s.length() - 1) {
            isPal(s, i, i);
            isPal(s, i, i + 1);
            i++;
        }
        return count;

    }
    private void isPal(String s, int i, int j) {
        while (i >= 0 && j < s.length()) {
            if (s.charAt(i) != s.charAt(j)) {
                return;
            } else {
                count++;
            }
            i--;
            j++;
        }
    }
}