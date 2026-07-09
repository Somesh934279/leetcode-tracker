// Last updated: 7/9/2026, 9:47:47 AM
class Solution {
    public int balancedStringSplit(String s) {
        int r = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R') {
                count++;
            }
            else {
                count--;
            }
            if (count == 0) {
                r++;
            }
        }
        return r;
    }
}