package davidch.leetcode.challenges.n310;

import java.util.*;

public class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        final var adjacent = new ArrayList<Set<Integer>>();
        final var nodes = new HashSet<Integer>();
        for (var i = 0; i < n; i++) {
            adjacent.add(new HashSet<>());
            nodes.add(i);
        }

        for (var edge : edges) {
            adjacent.get(edge[0]).add(edge[1]);
            adjacent.get(edge[1]).add(edge[0]);
        }

        final var leaves = new LinkedList<Integer>();

        while (nodes.size() > 2) {
            for (var i : nodes) {
                final var nexts = adjacent.get(i);
                if (nexts.size() == 1) leaves.add(i);
            }

            var toRemove = leaves.size();
            for (var i = 0; i < toRemove; i++) {
                final var leaf = leaves.pollFirst();
                final var next = adjacent.get(leaf).iterator().next();
                final var nextNext = adjacent.get(next);
                nextNext.remove(leaf);
                nodes.remove(leaf);
            }
        }

        return new ArrayList<>(nodes);
    }
}
