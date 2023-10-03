package davidch.leetcode.challenges.n2192;

import java.util.*;

public class Solution {
    public List<List<Integer>> getAncestors(int n, int[][] edges) {
        final var result = new ArrayList<List<Integer>>();
        final var parent = new ArrayList<Set<Integer>>();
        for (var i = 0; i < n; i++) {
            result.add(new ArrayList<>());
            parent.add(new HashSet<>());
        }

        for (var edge : edges) parent.get(edge[1]).add(edge[0]);

        for (var i = 0; i < n; i++) {
            final var visited = new boolean[n];
            visited[i] = true;
            final var ancestors = result.get(i);
            unroll(parent, visited, i, ancestors);
            Collections.sort(ancestors);
        }

        return result;
    }

    private void unroll(List<Set<Integer>> parent, boolean[] visited, int i, List<Integer> ancestors) {
        for (var node : parent.get(i)) {
            if (visited[node]) continue;
            ancestors.add(node);
            visited[node] = true;
            unroll(parent, visited, node, ancestors);
        }
    }
}
