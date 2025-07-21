// https://takeuforward.org/plus/dsa/problems/aggressive-cows


class Solution {
    public int aggressiveCows(int[] arr, int k) {
        Arrays.sort(arr);
        int n = arr.length;
        int low = 0;
        int high = arr[n - 1] - arr[0];
        int ans = 0;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (canWePlace(arr, mid, k)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    public boolean canWePlace(int[] arr, int dist, int k) {
        int countCows = 1;
        int last = arr[0];
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            if (arr[i] - last >= dist) {
                countCows++;
                last = arr[i];
            }
        }

        return countCows >= k;
    }
}
