class Solution {
    // Helper function: sum of squares of digits
    private int sumOfSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            n /= 10;
            sum += digit * digit;
        }
        return sum;
    }

    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        
        do {
            slow = sumOfSquares(slow);               // move one step
            fast = sumOfSquares(sumOfSquares(fast)); // move two steps
        } while (slow != fast);

        // If cycle ends at 1 → happy number
        return slow == 1;
    }
}
