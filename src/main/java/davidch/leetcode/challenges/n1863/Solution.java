package davidch.leetcode.challenges.n1863;

public class Solution {
    public int subsetXORSum(int[] nums) {
        return subsetXORSum(nums, 0, 0);
    }

    private int subsetXORSum(int[] nums, int i, int sum) {
        if (i == nums.length) return sum;
        return subsetXORSum(nums, i + 1, sum) + subsetXORSum(nums, i + 1, sum ^ nums[i]);
    }
}
