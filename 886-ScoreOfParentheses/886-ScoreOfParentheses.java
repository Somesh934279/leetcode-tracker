// Last updated: 7/9/2026, 9:48:57 AM
class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        int score = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                st.push(score);
                score = 0;
            }
            else {
                score = st.pop() + Math.max(2 * score, 1);
            }
        }
        return score;
    }
}