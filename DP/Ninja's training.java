// https://takeuforward.org/plus/dsa/problems/ninja's-training


class Solution {
    public int ninjaTraining(int[][] points) {
         int n = points.length;
        // prev[i] = max points up to previous day if last task was i (0,1,2,3)
        int[] prev = new int[4];

        // Day 0 initialization
        for (int last = 0; last < 4; last++) {
            prev[last] = 0;
            for (int task = 0; task < 3; task++) {
                if (task != last) {
                    prev[last] = Math.max(prev[last], points[0][task]);
                }
            }
        }

        // DP loop from Day 1 to Day n-1
        for (int day = 1; day < n; day++) {
            int[] curr = new int[4];
            for (int last = 0; last < 4; last++) {
                curr[last] = 0;
                for (int task = 0; task < 3; task++) {
                    if (task != last) {
                        int merit = points[day][task] + prev[task];
                        curr[last] = Math.max(curr[last], merit);
                    }
                }
            }
            prev = curr; // only keep the last day state
        }

        // Return max points when last day's previous activity is anything (0,1,2)
        return prev[3];
}
}