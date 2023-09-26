package davidch.leetcode.challenges.n997;

public class Solution {
    public int findJudge(int n, int[][] trust) {
        final var outdegree = new int[n + 1];
        final var indegree = new int[n + 1];

        for (var pair : trust) {
            outdegree[pair[0]]++;
            indegree[pair[1]]++;
        }

        var judge = -1;
        for (var i = 1; i <= n; i++) {
            if (outdegree[i] != 0 || indegree[i] != n - 1) continue;
            if (judge != -1) return -1;
            judge = i;
        }

        return judge;
    }
}
