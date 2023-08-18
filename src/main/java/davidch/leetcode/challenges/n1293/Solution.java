package davidch.leetcode.challenges.n1293;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    private static final int[][] MOVES = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};

    public int shortestPath(int[][] grid, int k) {
        final var targetI = grid.length - 1;
        final var targetJ = grid[0].length - 1;

        final var visited = new Step[grid.length][grid[0].length];

        final Queue<Coord> queue = new LinkedList<>();
        queue.add(new Coord(0, 0));
        visited[0][0] = new Step(k);

        var level = 0;
        while (!queue.isEmpty()) {
            for (var levelSize = queue.size(); levelSize > 0; levelSize--) {
                final var step = queue.poll();
                if (step.i == targetI && step.j == targetJ) return level;

                for (var move : MOVES) {
                    final var nextI = step.i + move[0];
                    final var nextJ = step.j + move[1];
                    if (nextI < 0 || nextI > targetI) continue;
                    if (nextJ < 0 || nextJ > targetJ) continue;
                    if (visited[nextI][nextJ] != null && visited[nextI][nextJ].k >= visited[step.i][step.j].k - grid[step.i][step.j]) continue;
                    if (visited[step.i][step.j].k - grid[step.i][step.j] < 0) continue;

                    queue.offer(new Coord(nextI, nextJ));
                    visited[nextI][nextJ] = new Step(visited[step.i][step.j].k - grid[step.i][step.j]);
                }
            }

            level++;
        }

        return -1;
    }

    private record Coord(int i, int j) {
    }

    private record Step(int k) {
    }
}
