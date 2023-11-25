package davidch.leetcode.challenges.n1685;

public class Solution {

    public int[] getSumAbsoluteDifferences(int[] nums) {
        var prefixSum = 0;
        var suffixSum = 0;
        for (var n : nums) suffixSum += n;

        final var result = new int[nums.length];
        for (var i = 0; i < result.length; i++) {
            suffixSum -= nums[i];
            final var suffixValue = suffixSum - nums[i] * (result.length - i - 1);
            final var prefixValue = i * nums[i] - prefixSum;
            result[i] = suffixValue + prefixValue;
            prefixSum += nums[i];
        }

        return result;
    }
}
