// Last updated: 7/9/2026, 9:52:26 AM
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String P= strs[0];
        for (int i=1;i<strs.length;i++) {
            while (!strs[i].startsWith(P)) {
                P = P.substring(0,P.length() - 1);
            }
        }
        return P;
    }
}