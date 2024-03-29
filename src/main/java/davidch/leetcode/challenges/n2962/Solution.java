package davidch.leetcode.challenges.n2962;

public class Solution {
    public long countSubarrays(int[] nums, int k) {
        var max = 0;

        for (var n : nums) max = Math.max(max, n);

        final var nextMax = new int[nums.length];
        var lastNextMax = nums.length;
        nextMax[nums.length - 1] = lastNextMax;
        for (var i = nums.length - 1; i >= 0; i--) {
            nextMax[i] = lastNextMax;
            if (nums[i] == max) lastNextMax = i;
        }


        var result = 0L;
        var maxesWithinWindow = 1;

        var left = nums[0] == max ? 0 : nextMax[0];
        var right = left;

        while (right < nums.length && maxesWithinWindow < k) {
            right = nextMax[right];
            maxesWithinWindow++;
        }

        while (right < nums.length) {
            if (maxesWithinWindow == k) {
                result += (left + 1L) * (nextMax[right] - right);
            }

            left = nextMax[left];
            right = nextMax[right];
        }

        return result;
    }
}
