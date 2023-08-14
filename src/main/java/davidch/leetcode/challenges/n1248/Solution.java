package davidch.leetcode.challenges.n1248;

import java.util.HashMap;

public class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        final var countsOccurrences = new HashMap<Integer, Integer>();
        countsOccurrences.put(0, 1);

        var currentCount = 0;
        var result = 0;
        for (var i = 0; i < nums.length; i++) {
            currentCount += nums[i] % 2;
            result += countsOccurrences.getOrDefault(currentCount - k, 0);
            countsOccurrences.put(currentCount, countsOccurrences.getOrDefault(currentCount, 0) + 1);
        }

        return result;
    }
}
