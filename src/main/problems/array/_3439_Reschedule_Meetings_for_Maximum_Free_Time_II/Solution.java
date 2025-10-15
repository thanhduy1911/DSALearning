package main.problems.array._3439_Reschedule_Meetings_for_Maximum_Free_Time_II;

public class Solution {
    public int maxFreeTime(int eventTime, int[] startTime, int[] endTime) {
        int n = startTime.length;
        // Calculate gaps[]
        int[] gaps = new int[n + 1];
        gaps[0] = startTime[0];
        for (int i = 1; i < n; i++) {
            gaps[i] = startTime[i] - endTime[i - 1];
        }
        gaps[n] = eventTime - endTime[n - 1];

        // prefix/suffix max of gaps
        int[] maxLeft = new int[n + 1];
        int[] maxRight = new int[n + 1];
        maxLeft[0] = gaps[0];
        for (int i = 1; i <= n; i++) {
            maxLeft[i] = Math.max(maxLeft[i - 1], gaps[i]);
        }
        maxRight[n] = gaps[n];
        for (int i = n - 1; i >= 0; i--) {
            maxRight[i] = Math.max(maxRight[i + 1], gaps[i]);
        }

        // Try to reschedule the meeting
        int ans = maxLeft[n]; // original max gap
        for (int i = 0; i < n; i++) {
            int duration = endTime[i] - startTime[i];
            int sumAdjacent = gaps[i] + gaps[i + 1];
            int bestOtherGap = 0;

            if (i > 0) bestOtherGap = Math.max(bestOtherGap, maxLeft[i - 1]);
            if (i + 2 <= n) bestOtherGap = Math.max(bestOtherGap, maxRight[i + 2]);

            int candidate = sumAdjacent;
            if (duration <= bestOtherGap) {
                candidate = Math.max(candidate, sumAdjacent + duration);
            }

            ans = Math.max(ans, candidate);
        }

        return ans;
    }
}
