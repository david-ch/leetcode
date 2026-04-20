package davidch.leetcode.challenges.n503;

import java.util.ArrayDeque;

public class Solution {
    public int[] nextGreaterElements(int[] nums) {
        final var result = new int[nums.length];
        final var nextGreaterElementIdx = new ArrayDeque<Integer>();

        for (var i = nums.length - 1; i >= 0; i--) {
            while (!nextGreaterElementIdx.isEmpty() && nums[nextGreaterElementIdx.peek()] <= nums[i])
                nextGreaterElementIdx.pop();
            nextGreaterElementIdx.push(i);
        }

        for (var i = nums.length - 1; i >= 0; i--) {
            while (!nextGreaterElementIdx.isEmpty() && nums[nextGreaterElementIdx.peek()] <= nums[i])
                nextGreaterElementIdx.pop();
            result[i] = nextGreaterElementIdx.isEmpty() ? -1 : nums[nextGreaterElementIdx.peek()];
            nextGreaterElementIdx.push(i);
        }

        return result;
    }
}
