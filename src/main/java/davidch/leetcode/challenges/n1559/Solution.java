package davidch.leetcode.challenges.n1559;

public class Solution {
    public boolean containsCycle(char[][] grid) {
        final boolean[][] visited = new boolean[grid.length][grid[0].length];
        for (var i = 0; i < grid.length; i++) {
            for (var j = 0; j < grid[i].length; j++) {
                if (visited[i][j]) continue;
                final var result = explore(grid, visited, i, j, i, j);
                if (result) return true;
            }
        }
        return false;
    }

    private boolean explore(char[][] grid, boolean[][] visited, int i, int j, int prevI, int prevJ) {
        if (visited[i][j]) return true;
        visited[i][j] = true;

        final var directions = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        for (var dir : directions) {
            var nextI = i + dir[0];
            var nextJ = j + dir[1];
            if (nextI == prevI && nextJ == prevJ) continue;

            if (nextI >= 0 && nextI < grid.length
                && nextJ >= 0 && nextJ < grid[0].length
                && grid[i][j] == grid[nextI][nextJ]
            ) {
                final var result = explore(grid, visited, nextI, nextJ, i, j);
                if (result) return true;
            }
        }

        return false;
    }
}
