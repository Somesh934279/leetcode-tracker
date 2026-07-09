// Last updated: 7/9/2026, 9:48:56 AM
class Solution {
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) return false;

        // Handle equal strings case
        if (s.equals(goal)) {
            int[] freq = new int[26];
            for (char c : s.toCharArray()) {
                freq[c - 'a']++;
                if (freq[c - 'a'] > 1) return true;
            }
            return false;
        }

        boolean ans = false;

        char ch1 = '\0';   //use null char instead of ' '
        char ch2 = '\0';
        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) != goal.charAt(i)) {
                count++;

                if (count > 2) return false;
                if (count == 1) {
                    ch1 = s.charAt(i);
                    ch2 = goal.charAt(i);
                } 
                else if (count == 2) {
                    if (ch1 == goal.charAt(i) && ch2 == s.charAt(i)) {
                        ans = true;
                    }
                }
            }
        }
        return ans;
    }
}