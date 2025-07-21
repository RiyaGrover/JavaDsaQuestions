//Link : https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/description/

class Solution {

    public static int findDays(int[] weights, int cap) {
        int day = 1;
        int load = 0;
        int n = weights.length;
        for (int i = 0; i < n; i++) {
            if (load + weights[i] > cap) {
                day = day + 1;
                load = weights[i];
            } else {
                load += weights[i];
            }
        }
        return day;
    }

    public int shipWithinDays(int[] weights, int days) {
        int low = Integer.MIN_VALUE, high = 0;
        for (int i = 0; i < weights.length; i++) {
            high += weights[i];
            low = Math.max(low, weights[i]);
        }

        while (low <= high) {
            int mid = (low + high) / 2;
            int noOfDays = findDays(weights, mid);
            if (noOfDays <= days) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;

    }
}