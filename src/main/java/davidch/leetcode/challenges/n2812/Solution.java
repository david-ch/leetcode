package davidch.leetcode.challenges.n2812;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class Solution {
    public int maximumSafenessFactor(List<List<Integer>> grid) {
        final var n = grid.size();
        final var safeness = new int[n][n];
        for (var row : safeness) Arrays.fill(row, Integer.MAX_VALUE);

        final var q = new LinkedList<int[]>();
        for (var i = 0; i < n; i++)
            for (var j = 0; j < n; j++)
                if (grid.get(i).get(j) == 1) q.add(new int[]{i, j});

        var safenessValue = 0;
        while (!q.isEmpty()) {
            final var levelSize = q.size();
            for (var item = 0; item < levelSize; item++) {
                final var cell = q.poll();
                if (safeness[cell[0]][cell[1]] != Integer.MAX_VALUE) continue;
                safeness[cell[0]][cell[1]] = safenessValue;
                if (cell[0] > 0) q.add(new int[]{cell[0] - 1, cell[1]});
                if (cell[0] < safeness.length - 1) q.add(new int[]{cell[0] + 1, cell[1]});
                if (cell[1] > 0) q.add(new int[]{cell[0], cell[1] - 1});
                if (cell[1] < safeness.length - 1) q.add(new int[]{cell[0], cell[1] + 1});
            }
            safenessValue++;
        }


        final var visited = new boolean[n][n];
        final var q2 = new PriorityQueue<int[]>((i1, i2) -> i2[2] - i1[2]);
        q2.add(new int[]{0, 0, safeness[0][0]});
        visited[0][0] = true;

        while (!q2.isEmpty()) {
            final var step = q2.poll();
            final var i = step[0];
            final var j = step[1];
            final var currentSafeness = step[2];

            if (i == n - 1 && j == n - 1) return currentSafeness;

            if (i > 0 && !visited[i - 1][j]) {
                q2.add(new int[]{i - 1, j, Math.min(currentSafeness, safeness[i - 1][j])});
                visited[i - 1][j] = true;
            }
            if (i < n - 1 && !visited[i + 1][j]) {
                q2.add(new int[]{i + 1, j, Math.min(currentSafeness, safeness[i + 1][j])});
                visited[i + 1][j] = true;
            }
            if (j > 0 && !visited[i][j - 1]) {
                q2.add(new int[]{i, j - 1, Math.min(currentSafeness, safeness[i][j - 1])});
                visited[i][j - 1] = true;
            }
            if (j < n - 1 && !visited[i][j + 1]) {
                q2.add(new int[]{i, j + 1, Math.min(currentSafeness, safeness[i][j + 1])});
                visited[i][j + 1] = true;
            }
        }
        return -1;
    }
}
