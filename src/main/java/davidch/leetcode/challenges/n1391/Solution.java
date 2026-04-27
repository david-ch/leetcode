package davidch.leetcode.challenges.n1391;

public class Solution {
    private static final int TOP = 0;
    private static final int RIGHT = 1;
    private static final int BOTTOM = 2;
    private static final int LEFT = 3;
    private static final int[][] DIRECTIONS = {
        {},
        {LEFT, RIGHT},
        {TOP, BOTTOM},
        {LEFT, BOTTOM},
        {RIGHT, BOTTOM},
        {TOP, LEFT},
        {TOP, RIGHT},
    };
    final static int[] TRANSITION = {BOTTOM, LEFT, TOP, RIGHT};
    final static int[][] SHIFT = {
        {0, -1},
        {1, 0},
        {0, 1},
        {-1, 0},
    };

    public boolean hasValidPath(int[][] grid) {
        if (grid[0][0] == 4) {
            return find(grid, 0) || find(grid, 1);
        }
        return find(grid, 0);
    }

    private boolean find(int[][] grid, int entrance) {
        final var visited = new boolean[grid.length][grid[0].length];

        var x = 0;
        var y = 0;
        while(true) {
            if (y == grid.length - 1 && x == grid[y].length - 1) return true;
            final var road = grid[y][x];
            final var exit = entrance == 0 ? 1 : 0;
            final var d = DIRECTIONS[road][exit];

            final var newX = x + SHIFT[d][0];
            final var newY = y + SHIFT[d][1];

            if (newY < 0 || newY == grid.length
                || newX < 0 || newX == grid[y].length
                || visited[newY][newX])
                return false;
            visited[y][x] = true;

            if (DIRECTIONS[grid[newY][newX]][0] == TRANSITION[d]) {
                x = newX;
                y = newY;
                entrance = 0;
            } else if (DIRECTIONS[grid[newY][newX]][1] == TRANSITION[d]) {
                x = newX;
                y = newY;
                entrance = 1;
            } else {
                return false;
            }
        }
    }
}
