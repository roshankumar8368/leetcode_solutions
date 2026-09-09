class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int low = 1;
        int high = 0;

        // Maximum pile find karo
        for (int pile : piles) {
            high = Math.max(high, pile);
        }

        while (low < high) {

            int mid = low + (high - low) / 2;

            long hours = 0;

            // Check kitne hours lagenge speed = mid par
            for (int pile : piles) {
                hours += (pile + mid - 1) / mid;
            }

            if (hours <= h) {
                // mid speed possible hai
                // aur slower speed check karo
                high = mid;
            } else {
                // mid speed bahut slow hai
                low = mid + 1;
            }
        }

        return low;
    }
}