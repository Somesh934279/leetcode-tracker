// Last updated: 7/9/2026, 9:52:14 AM
class Solution {

    public List<String> generateParenthesis(int n) {

        // Stores final answer
        List<String> ans = new ArrayList<>();

        // Start backtracking
        backtrack(ans, "", 0, 0, n);

        return ans;
    }

    public void backtrack(List<String> ans,
                          String current,
                          int open,
                          int close,
                          int n) {

        // Valid combination found
        if (current.length() == n * 2) {

            ans.add(current);
            return;
        }

        // Add opening bracket
        if (open < n) {

            backtrack(ans,
                      current + "(",
                      open + 1,
                      close,
                      n);
        }

        // Add closing bracket
        // only if valid
        if (close < open) {

            backtrack(ans,
                      current + ")",
                      open,
                      close + 1,
                      n);
        }
    }
}