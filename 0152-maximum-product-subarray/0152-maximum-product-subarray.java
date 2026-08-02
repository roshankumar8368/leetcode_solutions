class Solution {
    public int maxProduct(int[] nums) {
        int minBestEnding = nums[0];
        int maxBestEnding = nums[0];
        int result = nums[0];
        int n = nums.length;

        for (int i = 1; i < n; i++) {
            int v1 = minBestEnding * nums[i];
            int v2 = maxBestEnding * nums[i];
            int v3 = nums[i];

            minBestEnding = Math.min(v1, Math.min(v2, v3));
            maxBestEnding = Math.max(v1, Math.max(v2, v3));

            result = Math.max(result, Math.max(minBestEnding, maxBestEnding));
        }

        return result;
    }
}
