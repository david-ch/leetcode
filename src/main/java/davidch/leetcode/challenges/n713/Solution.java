package davidch.leetcode.challenges.n713;

public class Solution {

    public int numSubarrayProductLessThanK(int[] nums, int k) {
        var result = 0;

        for (int left = 0; left < nums.length; left++) {
            var sum = 1;
            for (var right = left; sum < k && right < nums.length; right++) {
                sum *= nums[right];
                if (sum < k) {
                    result++;
                }
            }
        }

        return result;
    }
}
