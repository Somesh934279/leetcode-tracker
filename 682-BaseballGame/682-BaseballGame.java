// Last updated: 7/9/2026, 9:49:34 AM
class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for (String each : operations) {
            if (each.equals("+")) {
                int top = stack.pop();
                int peek = stack.peek();
                stack.push(top);
                stack.push(top + peek);
            } else if (each.equals("D")) {
                stack.push(stack.peek() * 2);
            } else if (each.equals("C")) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(each));
            }
        }
        int sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }

        return sum;
    }
}