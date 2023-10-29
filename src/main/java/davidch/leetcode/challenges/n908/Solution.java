package davidch.leetcode.challenges.n908;

public class Solution {
    public int smallestRangeI(int[] nums, int k) {
        var min = Integer.MAX_VALUE;
        var max = Integer.MIN_VALUE;
        for (var n : nums) {
            min = Math.min(min, n);
            max = Math.max(max, n);
        }

        final var result = max - min - k * 2;
        return Math.max(result, 0);
    }
}
