package davidch.leetcode.challenges.n918;

import java.util.ArrayDeque;

public class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        final var numsCircular = new int[nums.length * 2];
        for (var i = 0; i < numsCircular.length; i++)
            numsCircular[i] = nums[i % nums.length];

        final var prefix = new int[numsCircular.length + 1];
        for (var i = 0; i < numsCircular.length; i++)
            prefix[i + 1] = numsCircular[i] + prefix[i];


        final var minPrefix = new ArrayDeque<Integer>();

        var result = Integer.MIN_VALUE;
        for (var i = 0; i < numsCircular.length; i++) {
            if (!minPrefix.isEmpty() && i - minPrefix.peekFirst() >= nums.length)
                minPrefix.removeFirst();
            while (!minPrefix.isEmpty() && prefix[minPrefix.peekLast()] >= prefix[i])
                minPrefix.removeLast();
            minPrefix.addLast(i);

            result = Math.max(result, prefix[i + 1] - prefix[minPrefix.peekFirst()]);
        }

        return result;
    }
}
