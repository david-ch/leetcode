package davidch.leetcode.challenges.n834;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int[] sumOfDistancesInTree(int n, int[][] edges) {
        final var neighbours = new ArrayList<List<Integer>>();
        for (var i = 0; i < n; i++) neighbours.add(new ArrayList<>());
        for (var edge : edges) {
            neighbours.get(edge[0]).add(edge[1]);
            neighbours.get(edge[1]).add(edge[0]);
        }


        final var childNodesCount = new int[n];
        Arrays.fill(childNodesCount, 1);
        final var result = new int[n];
        countNodesAndTopToBottomDistances(neighbours, 0, -1, childNodesCount, result);
        countInterSubtreesPaths(neighbours, 0, -1, childNodesCount, result);
        return result;
    }

    private void countNodesAndTopToBottomDistances(List<List<Integer>> neighbours, int current, int parent, int[] childNodesCount, int[] result) {
        for (var next : neighbours.get(current)) {
            if (next.equals(parent)) continue;
            countNodesAndTopToBottomDistances(neighbours, next, current, childNodesCount, result);
            childNodesCount[current] += childNodesCount[next];
            final var sumDistancesToLeaves = result[next] + childNodesCount[next];
            result[current] += sumDistancesToLeaves;
        }
    }

    private void countInterSubtreesPaths(List<List<Integer>> neighbours, int current, int parent, int[] childNodesCount, int[] result) {
        for (var next : neighbours.get(current)) {
            if (next.equals(parent)) continue;
            final var otherNodesCount = childNodesCount.length - childNodesCount[next];
            result[next] = result[current] - childNodesCount[next] + otherNodesCount;
            countInterSubtreesPaths(neighbours, next, current, childNodesCount, result);
        }
    }
}
