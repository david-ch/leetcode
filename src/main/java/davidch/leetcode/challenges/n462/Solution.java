package davidch.leetcode.challenges.n462;

import java.util.Arrays;

public class Solution {

    public int minMoves2(int[] nums) {
        Arrays.sort(nums);

        final var mid = nums.length / 2;
        final var median = nums[mid];

        var result = 0L;
        for (var i = 0; i < mid; i++) result += median - nums[i];
        for (var i = mid + 1; i < nums.length; i++) result += nums[i] - median;
        return (int) result;
    }
}
