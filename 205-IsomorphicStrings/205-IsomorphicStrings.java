// Last updated: 7/9/2026, 9:51:03 AM
class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] a = new int[200];
        int[] b = new int[200];
        for (int i = 0; i < s.length(); i++) {
            if (a[s.charAt(i)] != b[t.charAt(i)]) {
                return false;
            }
            a[s.charAt(i)] = i + 1;
            b[t.charAt(i)] = i + 1;
        }
        return true;
    }
}