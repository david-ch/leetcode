package davidch.leetcode.challenges.n2444;

import java.util.ArrayDeque;

public class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        final var min = new ArrayDeque<Integer>();
        final var max = new ArrayDeque<Integer>();

        var result = 0L;
        var left = 0;
        var right = -1;

        while (right < nums.length - 1) {
            right++;
            final var newNum = nums[right];

            while (!min.isEmpty() && nums[min.peekLast()] >= newNum) min.pollLast();
            min.addLast(right);

            while (!max.isEmpty() && nums[max.peekLast()] <= newNum) max.pollLast();
            max.addLast(right);

            while (!min.isEmpty() && nums[min.peekFirst()] < minK) left = min.pollFirst() + 1;
            while (!max.isEmpty() && nums[max.peekFirst()] > maxK) left = max.pollFirst() + 1;
            while (!min.isEmpty() && min.peekFirst() < left) min.pollFirst();
            while (!max.isEmpty() && max.peekFirst() < left) max.pollFirst();

            if (!min.isEmpty() && !max.isEmpty() && nums[min.peekFirst()] == minK && nums[max.peekFirst()] == maxK)
                result += Math.min(min.peekFirst(), max.peekFirst()) - left + 1;
        }

        return result;
    }
}
