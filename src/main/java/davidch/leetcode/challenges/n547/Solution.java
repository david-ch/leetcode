package davidch.leetcode.challenges.n547;

public class Solution {
    public int findCircleNum(int[][] isConnected) {
        final var visited = new boolean[isConnected.length];
        var provincesCount = 0;

        for (var province = 0; province < isConnected.length; province++) {
            if (visited[province]) continue;

            provincesCount++;
            visitNeighbors(isConnected, province, visited);
        }

        return provincesCount;
    }

    private void visitNeighbors(int[][] isConnected, int province, boolean[] visited) {
        for (var neighbor = 0; neighbor < isConnected[province].length; neighbor++) {
            if (isConnected[province][neighbor] == 0) continue;
            if (visited[neighbor]) continue;

            visited[neighbor] = true;
            visitNeighbors(isConnected, neighbor, visited);
        }
    }
}
