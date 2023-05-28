package davidch.leetcode.challenges.n209;

public class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        var result = Integer.MAX_VALUE;
        var left = 0;
        var sum = 0;

        for (var right = 0; right < nums.length; right++) {
            sum += nums[right];

            while (sum >= target && left <= right) {
                result = Math.min(result, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }

        return result == Integer.MAX_VALUE ? 0 : result;
    }
}
