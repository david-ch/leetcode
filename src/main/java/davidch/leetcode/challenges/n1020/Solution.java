package davidch.leetcode.challenges.n1020;

public class Solution {

    public static final int LAND = 1;
    public static final int VISITED_LAND = 2;

    public int numEnclaves(int[][] grid) {
        for (var i = 0; i < grid.length; i++) {
            if (grid[i][0] == LAND) visitLand(i, 0, grid);

            final var lastJ = grid[0].length - 1;
            if (grid[i][lastJ] == LAND) visitLand(i, lastJ, grid);
        }

        for (var j = 1; j < grid[0].length - 1; j++) {
            if (grid[0][j] == LAND) visitLand(0, j, grid);

            final var lastI = grid.length - 1;
            if (grid[lastI][j] == LAND) visitLand(lastI, j, grid);
        }

        var unvisitedLandCount = 0;
        for (var i = 0; i < grid.length; i++) {
            for (var j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == LAND) unvisitedLandCount++;
            }
        }

        return unvisitedLandCount;
    }

    private void visitLand(int i, int j, int[][] grid) {
        grid[i][j] = VISITED_LAND;
        if (i > 0 && grid[i - 1][j] == LAND) visitLand(i - 1, j, grid);
        if (i < grid.length - 2 && grid[i + 1][j] == LAND) visitLand(i + 1, j, grid);
        if (j > 0 && grid[i][j - 1] == LAND) visitLand(i, j - 1, grid);
        if (j < grid[0].length - 2 && grid[i][j + 1] == LAND) visitLand(i, j + 1, grid);
    }
}
