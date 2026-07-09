// Last updated: 7/9/2026, 9:48:09 AM
class Solution {
    public String removeDuplicates(String s) {

        StringBuilder stack = new StringBuilder();

        for(char c : s.toCharArray()) {

            int length = stack.length();

            if(length != 0 && stack.charAt(length - 1) == c) {

                // Pop operation
                stack.setLength(length - 1);

            } else {

                // Push operation
                stack.append(c);
            }
        }

        return stack.toString();
    }
}