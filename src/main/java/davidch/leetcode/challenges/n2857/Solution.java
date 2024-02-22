package davidch.leetcode.challenges.n2857;

import java.util.HashMap;
import java.util.List;

public class Solution {
    public int countPairs(List<List<Integer>> coordinates, int k) {
        final var pairCount = new HashMap<Long, Integer>();
        var result = 0;

        for (var c : coordinates) {
            final var x1 = c.get(0);
            final var y1 = c.get(1);

            for (var x = 0; x <= k; x++) {
                final var x2 = x1 ^ x;
                final var y2 = y1 ^ (k - x);
                result += pairCount.getOrDefault(x2 * (long) 10e7 + y2, 0);
            }

            final var key = x1 * (long) 10e7 + y1;
            pairCount.put(key, pairCount.getOrDefault(key, 0) + 1);
        }

        return result;
    }
}
