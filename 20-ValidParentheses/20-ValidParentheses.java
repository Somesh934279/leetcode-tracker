// Last updated: 7/9/2026, 9:52:17 AM
import java.util.*;

class Solution {
    public boolean isValid(String s) {

        Stack<Character> st = new Stack<>();

        for(char ch : s.toCharArray()) {

            if(ch == '(') st.push(')');
            else if(ch == '[') st.push(']');
            else if(ch == '{') st.push('}');
            else if(st.isEmpty() || st.pop() != ch) return false;
        }

        return st.isEmpty();
    }
}