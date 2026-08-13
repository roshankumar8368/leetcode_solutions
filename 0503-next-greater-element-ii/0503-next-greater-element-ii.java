class Solution {
    public int[] nextGreaterElements(int[] nums) {

        int n = nums.length;

        int[] res = new int[n];

        // Initially every answer is -1
        for (int i = 0; i < n; i++) {
            res[i] = -1;
        }

        Stack<Integer> stack = new Stack<>();

        // Traverse array twice
        for (int i = 2 * n - 1; i >= 0; i--) {

            int index = i % n;

            // Remove elements which cannot be the answer
            while (!stack.isEmpty() && stack.peek() <= nums[index]) {
                stack.pop();
            }

            // Only fill answer during the first traversal
            if (i < n) {
                if (!stack.isEmpty()) {
                    res[index] = stack.peek();
                }
            }

            // Put current element into stack
            stack.push(nums[index]);
        }

        return res;
    }
}