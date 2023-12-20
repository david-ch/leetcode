package davidch.leetcode.challenges.n474;

import java.util.Arrays;

public class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        final var zeroes = new int[strs.length];
        final var ones = new int[strs.length];
        for (var i = 0; i < strs.length; i++) {
            for (var ch : strs[i].toCharArray()) {
                if (ch == '0') zeroes[i]++;
                else ones[i]++;
            }
        }

        final var memo = new int[strs.length][m + 1][n + 1];
        for(var mat : memo)
            for (var row : mat)
                Arrays.fill(row, -1);

        return findMaxForm(zeroes, ones, 0, m, n, memo);
    }

    public int findMaxForm(int[] zeroes, int[] ones, int i, int m, int n, int[][][] memo) {
        if (i >= zeroes.length) return 0;

        if (memo[i][m][n] == -1)
            memo[i][m][n] = Math.max(
                    (zeroes[i] > m || ones[i] > n)
                            ? 0
                            : 1 + findMaxForm(zeroes, ones, i + 1, m - zeroes[i], n - ones[i], memo),
                    findMaxForm(zeroes, ones, i + 1, m, n, memo)
            );

        return memo[i][m][n];
    }
}
