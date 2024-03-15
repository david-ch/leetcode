package davidch.leetcode.challenges.n238;

public class Solution {
    public int[] productExceptSelf(int[] nums) {
        var product = 1;
        var zeroes = 0;
        for (var n : nums) {
            if (n == 0) zeroes++;
            else product *= n;
        }

        final var result = new int[nums.length];
        for (var i = 0; i < result.length; i++)
            result[i] = nums[i] == 0
                ? (zeroes > 1 ? 0 : product)
                : (zeroes > 0 ? 0 : product / nums[i]);

        return result;
    }
}
