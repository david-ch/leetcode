package davidch.leetcode.challenges.n910;

import java.util.Arrays;

public class Solution {
    public int smallestRangeII(int[] nums, int k) {
        Arrays.sort(nums);
        var result = nums[nums.length - 1] - nums[0];

        for (var i = 0; i < nums.length - 1; i++) {
            final var currentMax = Math.max(nums[i] + k, nums[nums.length - 1] - k);
            final var currentMin = Math.min(nums[i + 1] - k, nums[0] + k);
            result = Math.min(result, currentMax - currentMin);
        }

        return result;
    }
}
