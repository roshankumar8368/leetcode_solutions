class Solution {
    public String removeDuplicates(String s, int k) {

        char[] stackChar = new char[s.length()];
        int[] stackCount = new int[s.length()];

        int top = -1;

        for (char ch : s.toCharArray()) {

            // Stack empty hai ya previous character different hai
            if (top == -1 || stackChar[top] != ch) {

                top++;
                stackChar[top] = ch;
                stackCount[top] = 1;

            } else {

                // Same character hai, count badhao
                stackCount[top]++;

                // k characters ho gaye -> remove
                if (stackCount[top] == k) {
                    top--;
                }
            }
        }

        // Stack se answer banao
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i <= top; i++) {
            for (int j = 0; j < stackCount[i]; j++) {
                ans.append(stackChar[i]);
            }
        }

        return ans.toString();
    }
}