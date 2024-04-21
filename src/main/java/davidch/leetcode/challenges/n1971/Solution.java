package davidch.leetcode.challenges.n1971;

public class Solution {

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        final var unionFind = new UnionFind(n);
        for (var edge : edges) unionFind.union(edge[0], edge[1]);
        return unionFind.findRoot(source) == unionFind.findRoot(destination);
    }

    private static class UnionFind {

        private final int[] parent;

        UnionFind(int n) {
            parent = new int[n];
            for (var i = 0; i < n; i++) parent[i] = i;
        }

        int findRoot(int n) {
            if (parent[n] != n) parent[n] = findRoot(parent[n]);
            return parent[n];
        }

        void union(int n1, int n2) {
            parent[findRoot(n2)] = findRoot(n1);
        }
    }
}
