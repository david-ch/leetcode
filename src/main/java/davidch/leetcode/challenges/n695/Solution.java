package davidch.leetcode.challenges.n695;

public class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        var result = 0;

        for (var i = 0; i < grid.length; i++) {
            for (var j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 0) continue;
                result = Math.max(result, measureArea(grid, i, j));
            }
        }

        return result;
    }

    private int measureArea(int[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length) return 0;
        if (grid[i][j] == 0) return 0;
        grid[i][j] = 0;

        return 1
                + measureArea(grid, i - 1, j)
                + measureArea(grid, i + 1, j)
                + measureArea(grid, i, j - 1)
                + measureArea(grid, i, j + 1);
    }
}
