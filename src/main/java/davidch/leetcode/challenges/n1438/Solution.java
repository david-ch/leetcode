package davidch.leetcode.challenges.n1438;

import java.util.ArrayDeque;

public class Solution {
    public int longestSubarray(int[] nums, int limit) {
        final var minimums = new ArrayDeque<Integer>();
        final var maximums = new ArrayDeque<Integer>();

        var result = 0;
        var left = 0;
        for (var right = 0; right < nums.length; right++) {
            while (!minimums.isEmpty() && nums[minimums.peekLast()] >= nums[right]) minimums.pollLast();
            while (!maximums.isEmpty() && nums[maximums.peekLast()] <= nums[right]) maximums.pollLast();
            minimums.offerLast(right);
            maximums.offerLast(right);

            while (!minimums.isEmpty() && !maximums.isEmpty() && nums[maximums.peekFirst()] - nums[minimums.peekFirst()] > limit) {
                left++;
                if (minimums.peekFirst() < left) minimums.pollFirst();
                if (maximums.peekFirst() < left) maximums.pollFirst();
            }

            result = Math.max(result, right - left + 1);
        }

        return result;
    }
}
