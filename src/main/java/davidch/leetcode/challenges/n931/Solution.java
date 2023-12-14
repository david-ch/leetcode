package davidch.leetcode.challenges.n931;

import java.util.Arrays;

public class Solution {

    private int[][] memo;

    public int minFallingPathSum(int[][] matrix) {
        memo = new int[matrix.length][matrix[0].length];
        for (var i = 0; i < memo.length; i++) Arrays.fill(memo[i], Integer.MAX_VALUE);

        var min = Integer.MAX_VALUE;
        for (var i = 0; i < matrix[0].length; i++) {
            min = Math.min(min, minFallingPathSum(matrix, 0, i));
        }
        return min;
    }

    public int minFallingPathSum(int[][] matrix, int row, int col) {
        if (row == matrix.length - 1) return matrix[row][col];
        if (memo[row][col] != Integer.MAX_VALUE) return memo[row][col];

        var min = Integer.MAX_VALUE;
        for (var i = Math.max(0, col - 1); i <= Math.min(matrix[row].length - 1, col + 1); i++) {
            final var followingPath = minFallingPathSum(matrix, row + 1, i);
            memo[row + 1][i] = followingPath;

            min = Math.min(min, followingPath);
        }

        return min + matrix[row][col];
    }
}
