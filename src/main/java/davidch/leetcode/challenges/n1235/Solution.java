package davidch.leetcode.challenges.n1235;

import java.util.Arrays;

public class Solution {
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        final var jobs = new Job[startTime.length];
        for (var i = 0; i < jobs.length; i++)
            jobs[i] = new Job(startTime[i], endTime[i], profit[i]);
        Arrays.sort(jobs, (j1, j2) -> j1.startTime - j2.startTime);

        final var memo = new Integer[jobs.length + 1];
        memo[jobs.length] = 0;
        return jobScheduling(jobs, 0, memo);
    }

    private int jobScheduling(Job[] jobs, int idx, Integer[] memo) {
        if (memo[idx] != null) return memo[idx];

        var left = idx + 1;
        var right = jobs.length;
        while (left < right) {
            final var mid = left + (right - left) / 2;
            if (jobs[mid].startTime < jobs[idx].endTime) left = mid + 1;
            else right = mid;
        }

        memo[idx] = Math.max(
                jobScheduling(jobs, idx + 1, memo),
                jobs[idx].profit + jobScheduling(jobs, left, memo)
        );

        return memo[idx];
    }

    private record Job(int startTime, int endTime, int profit) {
    }
}
