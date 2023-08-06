package davidch.leetcode.challenges.n200;

public class Solution {

    public int numIslands(char[][] grid) {
        final var visited = new boolean[grid.length][grid[0].length];
        var result = 0;

        for (var i = 0; i < grid.length; i++) {
            for (var j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {
                    result++;
                    visitNeighbors(grid, visited, i, j);
                }
            }
        }

        return result;
    }

    private void visitNeighbors(char[][] grid, boolean[][] visited, int i, int j) {
        visited[i][j] = true;
        if (i > 0 && grid[i - 1][j] == '1' && !visited[i - 1][j]) visitNeighbors(grid, visited, i - 1, j);
        if (i < grid.length - 1 && grid[i + 1][j] == '1' && !visited[i + 1][j]) visitNeighbors(grid, visited, i + 1, j);
        if (j > 0 && grid[i][j - 1] == '1' && !visited[i][j - 1]) visitNeighbors(grid, visited, i, j - 1);
        if (j < grid[i].length - 1 && grid[i][j + 1] == '1' && !visited[i][j + 1]) visitNeighbors(grid, visited, i, j + 1);
    }
}
