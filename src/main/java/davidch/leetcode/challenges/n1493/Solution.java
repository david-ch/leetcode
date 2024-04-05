package davidch.leetcode.challenges.n1493;

public class Solution {
    public int longestSubarray(int[] nums) {
        var result = 0;
        var prevLeft = 0;
        var prevRight = 0;
        var left = 0;
        var right = 0;

        while (right < nums.length) {
            prevLeft = left;
            prevRight = right;

            left = right;
            while (left < nums.length && nums[left] == 0) left++;

            right = left;
            while (right < nums.length && nums[right] == 1) right++;

            result = left == 0 && right == nums.length
                ? right - left - 1
                : Math.max(result, right - left + (left - prevRight == 1 ? prevRight - prevLeft : 0));
        }

        return result;
    }
}
