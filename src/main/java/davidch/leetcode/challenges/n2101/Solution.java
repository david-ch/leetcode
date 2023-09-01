package davidch.leetcode.challenges.n2101;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int maximumDetonation(int[][] bombs) {
        final Queue<Integer> q = new LinkedList<>();
        var result = 0;

        for (var bombIdx = 0; bombIdx < bombs.length; bombIdx++) {
            final var visited = new boolean[bombs.length];
            q.offer(bombIdx);
            visited[bombIdx] = true;

            var currentResult = 0;
            while (!q.isEmpty()) {
                currentResult++;
                final var thisBombIdx = q.poll();

                for (var anotherBombIdx = 0; anotherBombIdx < bombs.length; anotherBombIdx++) {
                    if (thisBombIdx == anotherBombIdx || visited[anotherBombIdx]) continue;

                    final var xDelta = bombs[thisBombIdx][0] - bombs[anotherBombIdx][0];
                    final var yDelta = bombs[thisBombIdx][1] - bombs[anotherBombIdx][1];
                    final var dist = Math.sqrt(Math.pow(xDelta, 2) + Math.pow(yDelta, 2));
                    if (dist > bombs[thisBombIdx][2]) continue;

                    visited[anotherBombIdx] = true;
                    q.offer(anotherBombIdx);
                }
            }

            result = Math.max(result, currentResult);
        }

        return result;
    }
}
