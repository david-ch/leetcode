package davidch.leetcode.challenges.n62;

import java.util.Arrays;

public class Solution {
    public int uniquePaths(int m, int n) {
        final var memo = new int[m][n];
        Arrays.fill(memo[0], 1);
        for (var row = 1; row < m; row++) memo[row][0] = 1;

        for(var row = 1; row < m; row++)
            for (var col = 1; col < n; col++)
                memo[row][col] = memo[row - 1][col] + memo[row][col - 1];

        return memo[m - 1][n - 1];
    }
}
