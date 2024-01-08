package davidch.leetcode.challenges.n935;

public class Solution {

    private static final int MOD = (int) Math.pow(10, 9) + 7;

    private static final int[][] MOVES = {
            {4, 6},
            {6, 8},
            {7, 9},
            {4, 8},
            {3, 9, 0},
            {},
            {1, 7, 0},
            {2, 6},
            {1, 3},
            {2, 4},
    };

    public int knightDialer(int n) {
        final var memo = new int[10][5001];
        var result = 0;
        for (var i = 0; i < 10; i++) {
            result += knightDialer(i, n, memo);
            result %= MOD;
        }
        return result;
    }

    private int knightDialer(int p, int n, int[][] memo) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        if (memo[p][n] == 0) {
            for (var move : MOVES[p]) {
                memo[p][n] += knightDialer(move, n - 1, memo);
                memo[p][n] %= MOD;
            }

        }

        return memo[p][n];
    }
}
