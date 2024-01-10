package davidch.leetcode.challenges.n2373;

public class Solution {
    public int[][] largestLocal(int[][] grid) {
        final var result = new int[grid.length - 2][grid.length - 2];
        for (var i = 0; i < result.length; i++) {
            for (var j = 0; j < result.length; j++) {
                final var r1 = Math.max(Math.max(grid[i][j], grid[i][j + 1]), grid[i][j + 2]);
                final var r2 = Math.max(Math.max(grid[i + 1][j], grid[i + 1][j + 1]), grid[i + 1][j + 2]);
                final var r3 = Math.max(Math.max(grid[i + 2][j], grid[i + 2][j + 1]), grid[i + 2][j + 2]);

                result[i][j] = Math.max(Math.max(r1, r2), r3);
            }
        }

        return result;
    }
}
