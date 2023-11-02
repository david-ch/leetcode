package davidch.leetcode.challenges.n2294;

import java.util.Arrays;

public class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        var result = 1;

        var subsequenceStart = nums[0];
        for (var i = 1; i < nums.length; i++) {
            if (nums[i] - subsequenceStart > k) {
                result++;
                subsequenceStart = nums[i];
            }
        }

        return result;
    }
}
