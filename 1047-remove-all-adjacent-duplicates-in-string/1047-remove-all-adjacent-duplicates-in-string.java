class Solution {
    public String removeDuplicates(String s) {

        StringBuilder stack = new StringBuilder();

        for (char ch : s.toCharArray()) {

            // Agar top aur current character same hain
            if (stack.length() > 0 &&
                stack.charAt(stack.length() - 1) == ch) {

                // Duplicate pair remove
                stack.deleteCharAt(stack.length() - 1);

            } else {

                // Character add
                stack.append(ch);
            }
        }

        return stack.toString();
    }
}
