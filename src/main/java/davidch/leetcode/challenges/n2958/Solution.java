package davidch.leetcode.challenges.n2958;

import java.util.HashMap;

public class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        final var counts = new HashMap<Integer, Integer>();

        var result = 0;
        var left = 0;

        for (var right = 0; right < nums.length; right++) {
            var count = counts.getOrDefault(nums[right], 0) + 1;
            counts.put(nums[right], count);

            if (count > k) {
                while (left <= right) {
                    counts.put(nums[left], counts.get(nums[left]) - 1);
                    left++;
                    if (nums[right] == nums[left - 1]) break;
                }
            }

            result = Math.max(result, right - left + 1);
        }

        return result;
    }
}
