package davidch.leetcode.challenges.n2680;


public class Solution {

    public long maximumOr(int[] nums, int k) {
        if (nums.length == 1) return (long) nums[0] << k;

        final var leftToRightSums = new int[nums.length];
        leftToRightSums[0] = nums[0];
        for (var i = 1; i < nums.length; i++) leftToRightSums[i] = leftToRightSums[i - 1] | nums[i];

        final var rightToLeftSums = new int[nums.length];
        rightToLeftSums[nums.length - 1] = nums[nums.length - 1];
        for (var i = nums.length - 2; i >= 0; i--) rightToLeftSums[i] = rightToLeftSums[i + 1] | nums[i];

        long max = Math.max(
            nums[0] << k | rightToLeftSums[1],
            nums[nums.length - 1] << k | leftToRightSums[nums.length - 2]
        );

        for (var i = 1; i < nums.length - 1; i++) {
            max = Math.max(max, (long) nums[i] << k | leftToRightSums[i - 1] | rightToLeftSums[i + 1]);
        }

        return max;
    }
}
