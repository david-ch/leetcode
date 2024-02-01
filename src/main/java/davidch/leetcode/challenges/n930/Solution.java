package davidch.leetcode.challenges.n930;

import java.util.HashMap;

public class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        final var seenSumsCount = new HashMap<Integer, Integer>();
        seenSumsCount.put(0, 1);

        var result = 0;
        var sum = 0;
        for (var i = 0; i < nums.length; i++) {
            sum += nums[i];
            result += seenSumsCount.getOrDefault(sum - goal, 0);
            seenSumsCount.put(sum, seenSumsCount.getOrDefault(sum, 0) + 1);
        }

        return result;
    }
}
