package davidch.leetcode.challenges.n494;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return findTargetSumWays(nums, 0, target, new HashMap<>());
    }

    public int findTargetSumWays(int[] nums, int i, int target, Map<Integer, Integer[]> memo) {
        if (i == nums.length) return 0;
        if (i == nums.length - 1) return (nums[i] == target ? 1 : 0) + (nums[i] == -target ? 1 : 0);

        if (memo.get(target) == null || memo.get(target)[i] == null) {
            memo.computeIfAbsent(target, __ -> new Integer[nums.length])[i] = findTargetSumWays(nums, i + 1, target + nums[i], memo)
                    + findTargetSumWays(nums, i + 1, target - nums[i], memo);
        }

        return memo.get(target)[i];
    }
}
