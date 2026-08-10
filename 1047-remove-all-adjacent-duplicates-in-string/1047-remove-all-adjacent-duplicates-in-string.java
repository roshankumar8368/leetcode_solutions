import java.util.Stack;

class Solution {
    public String removeDuplicates(String s) {

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            if (!stack.isEmpty() && stack.peek() == ch) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }

        StringBuilder reverse = new StringBuilder();

        while (!stack.isEmpty()) {
            reverse.append(stack.pop());
        }

        return reverse.reverse().toString();
    }
}
