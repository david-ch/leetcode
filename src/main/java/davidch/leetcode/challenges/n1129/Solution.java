package davidch.leetcode.challenges.n1129;

import java.util.*;

public class Solution {
    public int[] shortestAlternatingPaths(int n, int[][] redEdges, int[][] blueEdges) {
        final var redEdgesIdx = indexEdges(redEdges);
        final var blueEdgesIdx = indexEdges(blueEdges);

        final var result = new int[n];
        Arrays.fill(result, -1);
        result[0] = 0;

        final var visitedBlue = new boolean[n];
        final var visitedRed = new boolean[n];
        visitedBlue[0] = true;
        visitedRed[0] = true;

        final Queue<Step> queue = new LinkedList<>();
        queue.offer(new Step(0, true));
        queue.offer(new Step(0, false));

        var level = 1;
        while (!queue.isEmpty()) {
            for (var i = queue.size(); i > 0; i--) {
                final var step = queue.poll();
                final var neighbours = (step.isBlue ? blueEdgesIdx : redEdgesIdx).getOrDefault(step.node, Collections.emptySet());
                final var visited = (step.isBlue ? visitedBlue : visitedRed);

                for (var neighbour : neighbours) {
                    if (visited[neighbour]) continue;
                    visited[neighbour] = true;
                    result[neighbour] = result[neighbour] == -1 ? level : Math.min(result[neighbour], level);
                    queue.offer(new Step(neighbour, !step.isBlue));
                }
            }

            level++;
        }
        return result;
    }

    private Map<Integer, Set<Integer>> indexEdges(int[][] edges) {
        final var result = new HashMap<Integer, Set<Integer>>();
        for (var edge : edges) {
            final var neighbours = result.getOrDefault(edge[0], new HashSet<>());
            neighbours.add(edge[1]);
            result.put(edge[0], neighbours);
        }
        return result;
    }

    private record Step(int node, boolean isBlue) {
    }
}
