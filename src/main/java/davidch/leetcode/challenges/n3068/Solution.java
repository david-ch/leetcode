package davidch.leetcode.challenges.n3068;

public class Solution {
    public long maximumValueSum(int[] nums, int k, int[][] edges) {
        final var result = new long[2][nums.length + 1];
        result[0][nums.length] = Integer.MIN_VALUE;
        result[1][nums.length] = 0;

        for (var i = nums.length - 1; i >= 0; i--) {
            for (var evenNumOfOps = 0; evenNumOfOps < 2; evenNumOfOps++) {
                final var withOp = result[evenNumOfOps ^ 1][i + 1] + (nums[i] ^ k);
                final var withoutOp = result[evenNumOfOps][i + 1] + nums[i];
                result[evenNumOfOps][i] = Math.max(withOp, withoutOp);
            }
        }

        return result[1][0];
    }
}
