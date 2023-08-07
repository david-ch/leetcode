package davidch.leetcode.challenges.n1466;

import java.util.*;

public class Solution {
    public int minReorder(int n, int[][] connections) {
        final var visited = new boolean[n];
        final var neighbors = new ArrayList<List<Integer>>(n);

        for (var i = 0; i < n; i++) {
            neighbors.add(new ArrayList<>());
        }

        for (var connection : connections) {
            neighbors.get(connection[0]).add(-connection[1]);
            neighbors.get(connection[1]).add(connection[0]);
        }

        var result = 0;

        final Queue<Integer> queue = new LinkedList<>();
        queue.offer(0);
        visited[0] = true;
        while (!queue.isEmpty()) {
            final var city = queue.poll();

            for (var neighbor : neighbors.get(city)) {
                final var neighborAbs = Math.abs(neighbor);
                if (!visited[neighborAbs]) {
                    if (neighbor < 0) result++;
                    queue.offer(neighborAbs);
                    visited[neighborAbs] = true;
                }
            }
        }

        return result;
    }
}
