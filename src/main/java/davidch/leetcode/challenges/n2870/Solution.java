package davidch.leetcode.challenges.n2870;

import java.util.HashMap;

public class Solution {
    public int minOperations(int[] nums) {
        final var numCount = new HashMap<Integer, Integer>();
        for (var n: nums)
            numCount.put(n, numCount.getOrDefault(n, 0) + 1);

        var result = 0;
        for (var cnt: numCount.values()) {
            if (cnt % 3 == 0) result += cnt / 3;
            else if (cnt > 2 && (cnt - 2) % 3 == 0) result += 1 + (cnt - 2) / 3;
            else if (cnt > 4 && (cnt - 4) % 3 == 0) result += 2 + (cnt - 4) / 3;
            else if (cnt % 2 == 0) result += cnt / 2;
            else return -1;
        }

        return result;
    }
}
