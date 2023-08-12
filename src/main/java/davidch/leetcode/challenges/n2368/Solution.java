package davidch.leetcode.challenges.n2368;

import java.util.HashSet;

public class Solution {

    private static class UnionFind {
        private final int[] root;
        private final int[] rank;

        public UnionFind(int size) {
            root = new int[size];
            rank = new int[size];
            for (var i = 0; i < size; i++) {
                root[i] = i;
                rank[i] = 1;
            }
        }

        private int findRoot(int node) {
            if (root[node] != node) {
                root[node] = findRoot(root[node]);
            }
            return root[node];
        }

        public void union(int nodeA, int nodeB) {
            var rootA = findRoot(nodeA);
            var rootB = findRoot(nodeB);
            if (rootA == rootB) return;
            if (rank[rootA] > rank[rootB]) {
                final var tmp = rootA;
                rootA = rootB;
                rootB = tmp;
            }

            root[rootA] = rootB;
            rank[rootB] += rank[rootA];
        }

        public int rank(int node) {
            return rank[findRoot(node)];
        }
    }

    public int reachableNodes(int n, int[][] edges, int[] restricted) {
        final var uf = new UnionFind(n);
        final var restrictedSet = new HashSet<Integer>();
        for (var i = 0; i < restricted.length; i++) {
            restrictedSet.add(restricted[i]);
        }

        for (var i = 0; i < edges.length; i++) {
            if (restrictedSet.contains(edges[i][0]) || restrictedSet.contains(edges[i][1])) continue;
            uf.union(edges[i][0], edges[i][1]);
        }

        return uf.rank(0);
    }
}
