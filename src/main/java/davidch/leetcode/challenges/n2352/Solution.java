package davidch.leetcode.challenges.n2352;

import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public int equalPairs(int[][] grid) {
        final var seenSequencesCounts = new HashMap<String, Integer>();
        for (var r = 0; r < grid.length; r++) {
            final var key = Arrays.toString(grid[r]);
            seenSequencesCounts.put(key, seenSequencesCounts.getOrDefault(key, 0) + 1);
        }

        var count = 0;
        for (var c = 0; c < grid.length; c++) {
            final var column = new int[grid.length];
            for (var r = 0; r < grid.length; r++) {
                column[r] = grid[r][c];
            }

            count += seenSequencesCounts.getOrDefault(Arrays.toString(column), 0);
        }

        return count;
    }
}
