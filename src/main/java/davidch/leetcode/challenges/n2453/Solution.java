package davidch.leetcode.challenges.n2453;

import java.util.HashMap;

public class Solution {
    public int destroyTargets(int[] nums, int space) {
        final var remindersCount = new HashMap<Integer, Integer>();
        var maxCount = 0;
        for (var n : nums) {
            final var reminder = n % space;
            final var newCountVal = remindersCount.getOrDefault(reminder, 0) + 1;
            remindersCount.put(reminder, newCountVal);
            maxCount = Math.max(maxCount, newCountVal);
        }

        var result = Integer.MAX_VALUE;
        for (var n : nums)
            if (remindersCount.get(n % space) == maxCount)
                result = Math.min(result, n);

        return result;
    }
}
