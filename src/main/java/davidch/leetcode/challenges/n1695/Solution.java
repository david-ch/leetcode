package davidch.leetcode.challenges.n1695;

import java.util.HashSet;

public class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        final var elementsWithinWindow = new HashSet<Integer>();

        var result = 0;
        var currentSum = 0;
        var left = 0;
        for (var right = 0; right < nums.length; right++) {
            if (elementsWithinWindow.contains(nums[right])) {
                result = Math.max(result, currentSum);
                do {
                    currentSum -= nums[left];
                    elementsWithinWindow.remove(nums[left]);
                    left++;
                } while (nums[left - 1] != nums[right]);
            }

            currentSum += nums[right];
            elementsWithinWindow.add(nums[right]);
        }

        result = Math.max(result, currentSum);
        return result;
    }
}
