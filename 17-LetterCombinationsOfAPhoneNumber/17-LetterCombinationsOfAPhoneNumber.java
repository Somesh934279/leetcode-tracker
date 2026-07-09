// Last updated: 7/9/2026, 9:52:20 AM
class Solution {
    List<String> ans = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) return ans;
        String[] map = {
            "", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"
        };
        solve(digits, "", 0, map);
        return ans;
    }
    void solve(String digits, String s, int i, String[] map) {
        if (i == digits.length()) {
            ans.add(s);
            return;
        }
        String letters = map[digits.charAt(i) - '0'];
        for (char c : letters.toCharArray()) {
            solve(digits, s + c, i + 1, map);
        }
    }
}