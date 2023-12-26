package davidch.leetcode.challenges.n1155;

import java.util.Arrays;

public class Solution {

    private static final long MOD = (int) Math.pow(10, 9) + 7;

    public int numRollsToTarget(int n, int k, int target) {
        final var memo = new int[n + 1][target + 1];
        for (var row : memo) Arrays.fill(row, -1);
        return numRollsToTarget(n, k, target, memo);
    }

    public int numRollsToTarget(int n, int k, int target, int[][] memo) {
        if (target <= 0) return 0;
        if (n == 1) {
            if (k >= target) return 1;
            else return 0;
        }

        if (memo[n][target] == -1) {
            var result = 0L;
            for (var i = 1; i <= k; i++) {
                result += numRollsToTarget(n - 1, k, target - i, memo);
                result %= MOD;
            }
            memo[n][target] = (int) result;
        }

        return memo[n][target];
    }
}
