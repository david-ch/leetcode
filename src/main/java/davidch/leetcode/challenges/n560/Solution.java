package davidch.leetcode.challenges.n560;

import java.util.HashMap;

public class Solution {
    public int subarraySum(int[] nums, int k) {
        final var sumsCounts = new HashMap<Integer, Integer>();
        sumsCounts.put(0, 1);

        var result = 0;
        var sum = 0;
        for (var i = 0; i < nums.length; i++) {
            sum += nums[i];
            result += sumsCounts.getOrDefault(sum - k, 0);
            sumsCounts.put(sum, sumsCounts.getOrDefault(sum, 0) + 1);
        }

        return result;
    }
}
