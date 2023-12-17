package davidch.leetcode.challenges.n279;

public class Solution {

    public int numSquares(int n) {
        return numSquares(n, new int[n + 1]);
    }

    public int numSquares(int n, int[] memo) {
        if (memo[n] != 0) return memo[n];
        if (Math.sqrt(n) % 1 == 0) return 1;

        var min = Integer.MAX_VALUE;
        for (var i = 1; i * i <= n; i++) {
            min = Math.min(min, numSquares(n - i * i, memo));
        }

        memo[n] = 1 + min;
        return memo[n];
    }
}
