package davidch.leetcode.challenges.n1005;

import java.util.Arrays;

public class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);

        var idx = 0;
        while (idx < nums.length && nums[idx] < 0 && k > 0) {
            nums[idx] = -nums[idx];
            k--;
            idx++;
        }

        if (k % 2 == 1) {
            if (idx == nums.length || (idx > 0 && nums[idx - 1] < nums[idx])) idx--;
            nums[idx] = -nums[idx];
        }

        var result = 0;
        for (var n : nums) result += n;

        return result;
    }
}
