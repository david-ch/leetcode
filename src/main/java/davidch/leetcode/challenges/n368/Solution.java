package davidch.leetcode.challenges.n368;

import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        final var solution = new int[nums.length];
        final var prev = new int[nums.length];

        solution[0] = 1;
        prev[0] = -1;

        for (var i = 1; i < nums.length; i++) {
            for (var p = i - 1; p >= 0; p--) {
                if (nums[i] % nums[p] == 0 && solution[i] < solution[p] + 1) {
                    solution[i] = solution[p] + 1;
                    prev[i] = p;
                }
            }

            if (solution[i] == 0) {
                solution[i] = 1;
                prev[i] = -1;
            }
        }

        var maxSolutionIdx = 0;
        for (var i = 1; i < solution.length; i++)
            if (solution[maxSolutionIdx] < solution[i]) maxSolutionIdx = i;

        final var result = new Integer[solution[maxSolutionIdx]];
        for (var i = result.length - 1; i >= 0; i--) {
            result[i] = nums[maxSolutionIdx];
            maxSolutionIdx = prev[maxSolutionIdx];
        }

        return Arrays.asList(result);
    }
}
