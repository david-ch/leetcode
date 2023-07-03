package davidch.leetcode.challenges.n239;

import java.util.ArrayDeque;

public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        final var result = new int[nums.length - k + 1];
        final var maximumsWithinWindow = new ArrayDeque<Integer>();

        final var len = nums.length;
        for (var i = 0; i < len; i++) {
            if (!maximumsWithinWindow.isEmpty() && maximumsWithinWindow.peekFirst() == i - k) {
                maximumsWithinWindow.pollFirst();
            }

            while (!maximumsWithinWindow.isEmpty() && nums[maximumsWithinWindow.peekLast()] < nums[i]) {
                maximumsWithinWindow.pollLast();
            }

            maximumsWithinWindow.offerLast(i);

            if (i - k + 1 >= 0) {
                result[i - k + 1] = nums[maximumsWithinWindow.peekFirst()];
            }

        }

        return result;
    }
}
