package davidch.leetcode.challenges.n64;

public class Solution {
    public int minPathSum(int[][] grid) {
        for (var i = 0; i < grid.length; i++) {
            for (var j = 0; j < grid[0].length; j++) {
                if (i == 0 && j == 0) continue;
                final var left = i > 0 ? grid[i - 1][j] : Integer.MAX_VALUE;
                final var up = j > 0 ? grid[i][j - 1] : Integer.MAX_VALUE;
                grid[i][j] += Math.min(left, up);
            }
        }

        return grid[grid.length - 1][grid[0].length - 1];
    }
}
