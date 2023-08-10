package davidch.leetcode.challenges.n1971;

public class Solution {

    static class UnionFind {
        private final int[] root;
        private final int[] rank;

        public UnionFind(int size) {
            root = new int[size];
            rank = new int[size];
            for (var i = 0; i < size; i++) {
                root[i] = i;
                rank[i] = i;
            }
        }

        public int find(int node) {
            if (root[node] != node) {
                root[node] = find(root[node]);
            }

            return root[node];
        }

        public void union(int a, int b) {
            final var rootA = find(a);
            final var rootB = find(b);

            if (rootA == rootB) return;
            if (rank[a] > rank[b]) {
                root[rootB] = rootA;
                rank[rootB] += rank[rootA];
            }
            else {
                root[rootA] = rootB;
                rank[rootA] += rank[rootB];
            }
        }
    }

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        final var unionFind = new UnionFind(n);
        for (int[] edge : edges) {
            unionFind.union(edge[0], edge[1]);
        }

        return unionFind.find(source) == unionFind.find(destination);
    }
}
