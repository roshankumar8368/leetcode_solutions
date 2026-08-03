class Solution {
    public int maxAbsoluteSum(int[] nums) {

        int maxBestEnd = nums[0];
        int minBestEnd = nums[0];
        int ans = Math.abs(nums[0]);

        for (int i = 1; i < nums.length; i++) {

            maxBestEnd = Math.max(nums[i], maxBestEnd + nums[i]);

            minBestEnd = Math.min(nums[i], minBestEnd + nums[i]);

            ans = Math.max(ans,
                    Math.max(Math.abs(maxBestEnd), Math.abs(minBestEnd)));
        }

        return ans;
    }
}