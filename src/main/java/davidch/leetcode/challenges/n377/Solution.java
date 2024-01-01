package davidch.leetcode.challenges.n377;

public class Solution {
    public int combinationSum4(int[] nums, int target) {
        return combinationSum4(nums, target, new Integer[target + 1]);
    }

    public int combinationSum4(int[] nums, int target, Integer[] memo) {
        if (memo[target] == null) {
            memo[target] = 0;
            for (int num : nums)
                if (num == target) memo[target]++;
                else if (num < target) memo[target] += combinationSum4(nums, target - num, memo);
        }

        return memo[target];
    }
}
