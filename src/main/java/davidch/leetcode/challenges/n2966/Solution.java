package davidch.leetcode.challenges.n2966;

import java.util.Arrays;

public class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        final var result = new int[nums.length / 3][3];

        var numIdx = 0;
        for (var i = 0; i < result.length; i++) {
            final int[] row = {
                    nums[numIdx++],
                    nums[numIdx++],
                    nums[numIdx++]
            };
            result[i] = row;

            if (row[2] - row[1] > k || row[2] - row[0] > k) return new int[][]{};
        }

        return result;
    }
}
