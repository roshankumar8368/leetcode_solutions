class Solution {
    public int mySqrt(int x) {
        if (x < 2) return x; // sqrt(0)=0, sqrt(1)=1

        int left = 1, right = x / 2; // sqrt(x) <= x/2 for x >= 2
        int ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if ((long) mid * mid <= x) {
                ans = mid;       // mid is a candidate
                left = mid + 1;  // try bigger
            } else {
                right = mid - 1; // too big, go smaller
            }
        }

        return ans;
    }
}
