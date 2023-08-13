package davidch.leetcode.challenges.n1091;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        if (grid[0][0] == 1) return -1;

        final Queue<Step> queue = new LinkedList<>();
        queue.add(new Step(0, 0, 1));
        grid[0][0] = 1;

        var shortestPathLen = Integer.MAX_VALUE;

        while (!queue.isEmpty()) {
            final var step = queue.poll();

            if (step.i == grid.length - 1 && step.j == grid.length - 1) {
                shortestPathLen = Math.min(shortestPathLen, step.len);
                continue;
            }

            for (var iShift = -1; iShift <= 1; iShift++) {
                final var nextI = step.i + iShift;
                if (nextI < 0 || nextI >= grid.length) continue;
                for (var jShift = -1; jShift <= 1; jShift++) {
                    final var nextJ = step.j + jShift;
                    if (nextJ < 0 || nextJ >= grid.length) continue;
                    if (grid[nextI][nextJ] == 1) continue;
                    queue.add(new Step(nextI, nextJ, step.len + 1));
                    grid[nextI][nextJ] = 1;
                }
            }

        }

        return shortestPathLen == Integer.MAX_VALUE ? - 1 : shortestPathLen;
    }

    private record Step(int i, int j, int len) {
    }
}
