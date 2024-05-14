package davidch.leetcode.challenges.n1219;

public class Solution {
    public int getMaximumGold(int[][] grid) {
        var result = 0;
        var cellsFound = 0;
        for (var i = 0; i < grid.length; i++) {
            for (var j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 0) continue;
                cellsFound++;
                result = Math.max(result, getMaximumGold(grid, 0, i, j));
                if (cellsFound == 25) break;
            }
            if (cellsFound == 25) break;
        }
        return result;
    }

    private int getMaximumGold(int[][] grid, int cellsFound, int i, int j) {
        final var goldCollected = grid[i][j];
        var maxCollectedNext = 0;
        grid[i][j] = 0;
        if (cellsFound < 25) {
            if (i > 0 && grid[i - 1][j] != 0)
                maxCollectedNext = Math.max(maxCollectedNext, getMaximumGold(grid, cellsFound + 1, i - 1, j));
            if (i < grid.length - 1 && grid[i + 1][j] != 0)
                maxCollectedNext = Math.max(maxCollectedNext, getMaximumGold(grid, cellsFound + 1, i + 1, j));
            if (j > 0 && grid[i][j - 1] != 0)
                maxCollectedNext = Math.max(maxCollectedNext, getMaximumGold(grid, cellsFound + 1, i, j - 1));
            if (j < grid[i].length - 1 && grid[i][j + 1] != 0)
                maxCollectedNext = Math.max(maxCollectedNext, getMaximumGold(grid, cellsFound + 1, i, j + 1));
        }
        grid[i][j] = goldCollected;
        return goldCollected + maxCollectedNext;
    }
}
