package davidch.leetcode.challenges.n1;

import java.util.HashMap;

public class Solution {

    public int[] twoSum(int[] nums, int target) {
        final var visitedNumToIdx = new HashMap<Integer, Integer>();

        for (var i = 0; i < nums.length; i++) {
            final var secondNum = target - nums[i];
            if (visitedNumToIdx.containsKey(secondNum)) {
                return new int[] { visitedNumToIdx.get(secondNum), i };
            }

            visitedNumToIdx.put(nums[i], i);
        }

        throw new IllegalArgumentException("Solution wasn't found");
    }
}
