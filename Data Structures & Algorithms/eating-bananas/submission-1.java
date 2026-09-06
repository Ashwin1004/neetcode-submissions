class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int max = 0;

        for (int num : piles) {
            max = Math.max(max, num);
        }

        int low = 1;
        int high = max;

        while (low <= high) {

            int k = low + (high - low) / 2;

            long hours = 0;

        
            for (int nums : piles) {
                hours += (nums + k - 1) / k;
            }

            if (hours <= h) {
    
                high = k - 1;
            } else {
    
                low = k + 1;
            }
        }

        return low;
    }
}