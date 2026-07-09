// Last updated: 7/9/2026, 9:49:00 AM
class Solution {
    public boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }

    private String build(String str){
        Deque<Character> stack = new ArrayDeque<>();

        for(char ch : str.toCharArray()){
            if(ch == '#'){
                if(!stack.isEmpty())
                    stack.pop();
            }else{
                stack.push(ch);
            }
        }

        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }

        return sb.toString();
    }
}