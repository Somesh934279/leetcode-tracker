// Last updated: 7/9/2026, 9:50:51 AM
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        int[] arr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }

        for (int check : arr) {
            if (check != 0)
                return false;
        }

        return true;
    }
}