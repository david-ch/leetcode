package davidch.leetcode.challenges.n643;

public class Solution {

    public double findMaxAverage(int[] nums, int k) {
        var currentSum = 0;

        for (var i = 0; i < k; i++) {
            currentSum += nums[i];
        }

        var maxSum = currentSum;
        for (var i = k; i < nums.length; i++) {
            currentSum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, currentSum);
        }

        return (double) maxSum / k;
    }
}
