class Solution {
    public int findMin(int[] nums) {
        
        int low = 0;
        int high = nums.length - 1;
        
        while (low < high) {
            
            int mid = low + (high - low) / 2;
            
            // Minimum element right side mein hai
            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } 
            
            // Minimum element mid par ya left side mein hai
            else {
                high = mid;
            }
        }
        
        return nums[low];
    }
}