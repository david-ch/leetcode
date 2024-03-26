package davidch.leetcode.challenges.n41;

public class Solution {
    public int firstMissingPositive(int[] nums) {
        for (var start = 0; start < nums.length; start++) {
            var i = nums[start] - 1;
            while (i >= 0 && i < nums.length && nums[i] != i + 1) {
                final var nextI = nums[i] - 1;
                nums[i] = i + 1;
                i = nextI;
            }
        }

        for (var i = 0; i < nums.length; i++)
            if (nums[i] != i + 1) return i + 1;

        return nums.length + 1;
    }
}
