package davidch.leetcode.challenges.n688;

public class Solution {
    public double knightProbability(int n, int k, int row, int column) {
        return knightProbability(n, k, row, column, new double[k + 1][n][n]);
    }

    public double knightProbability(int n, int k, int row, int col, double[][][] memo) {
        if (row < 0 || row >= n || col < 0 || col >= n) return 0;
        if (k == 0) return 1;

        if (memo[k][row][col] == 0) {
            memo[k][row][col] = 0.125 * (
                    knightProbability(n, k - 1, row - 2, col + 1, memo)
                    + knightProbability(n, k - 1, row - 1, col + 2, memo)
                    + knightProbability(n, k - 1, row + 1, col + 2, memo)
                    + knightProbability(n, k - 1, row + 2, col + 1, memo)
                    + knightProbability(n, k - 1, row + 2, col - 1, memo)
                    + knightProbability(n, k - 1, row + 1, col - 2, memo)
                    + knightProbability(n, k - 1, row - 1, col - 2, memo)
                    + knightProbability(n, k - 1, row - 2, col - 1, memo)
            );
        }

        return memo[k][row][col];
    }
}
