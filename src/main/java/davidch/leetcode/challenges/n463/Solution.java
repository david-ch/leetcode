package davidch.leetcode.challenges.n463;

public class Solution {

    public static final int WATER = 0;
    public static final int LAND = 1;
    public static final int VISITED_LAND = 2;

    public int islandPerimeter(int[][] grid) {
        var startI = -1;
        var startJ = -1;

        for (var i = 0; i < grid.length; i++) {
            for (var j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == WATER) continue;
                startI = i;
                startJ = j;
                break;
            }
            if (startI != -1) break;
        }

        return measureLand(startI, startJ, grid);
    }

    private int measureLand(int i, int j, int[][] grid) {
        grid[i][j] = VISITED_LAND;

        var result = 0;
        if (i == 0 || grid[i - 1][j] == WATER) result++;
        if (i == grid.length - 1 || grid[i + 1][j] == WATER) result++;
        if (j == 0 || grid[i][j - 1] == WATER) result++;
        if (j == grid[i].length - 1 || grid[i][j + 1] == WATER) result++;

        if (i != 0 && grid[i - 1][j] == LAND) result += measureLand(i - 1, j, grid);
        if (i < grid.length - 1 && grid[i + 1][j] == LAND) result += measureLand(i + 1, j, grid);
        if (j != 0 && grid[i][j - 1] == LAND) result += measureLand(i, j - 1, grid);
        if (j < grid[i].length - 1 && grid[i][j + 1] == LAND) result += measureLand(i, j + 1, grid);

        return result;
    }
}
