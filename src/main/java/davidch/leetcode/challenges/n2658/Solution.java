package davidch.leetcode.challenges.n2658;

public class Solution {
    public int findMaxFish(int[][] grid) {
        var result = 0;

        for (var i = 0; i < grid.length; i++)
            for (var j = 0; j < grid[i].length; j++)
                if (grid[i][j] > 0) result = Math.max(result, catchAllFish(grid, i, j));

        return result;
    }

    private int catchAllFish(int[][] grid, int i, int j) {
        var result = grid[i][j];
        grid[i][j] = 0;

        if (i > 0 && grid[i - 1][j] > 0) result += catchAllFish(grid, i - 1, j);
        if (i < grid.length - 1 && grid[i + 1][j] > 0) result += catchAllFish(grid, i + 1, j);
        if (j > 0 && grid[i][j - 1] > 0) result += catchAllFish(grid, i, j - 1);
        if (j < grid[i].length - 1 && grid[i][j + 1] > 0) result += catchAllFish(grid, i, j + 1);

        return result;
    }
}
