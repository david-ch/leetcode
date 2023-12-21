package davidch.leetcode.challenges.n221;

import java.util.Arrays;

public class Solution {
    public int maximalSquare(char[][] matrix) {
        final var memo = new int[matrix.length][matrix[0].length];
        for (var row : memo) Arrays.fill(row, -1);

        var result = 0;

        for (var row = 0; row < matrix.length; row++)
            for (var col = 0; col < matrix[row].length; col++)
                result = Math.max(result, maximalSquare(matrix, row, col, memo));

        return result * result;
    }

    public int maximalSquare(char[][] matrix, int startRow, int startCol, int[][] memo) {
        if (startRow == matrix.length || startCol == matrix[startRow].length || matrix[startRow][startCol] != '1')
            return 0;

        if (memo[startRow][startCol] == -1) {
            memo[startRow][startCol] = 1 + Math.min(
                    Math.min(
                            maximalSquare(matrix, startRow + 1, startCol + 1, memo),
                            maximalSquare(matrix, startRow + 1, startCol, memo)
                    ),
                    maximalSquare(matrix, startRow, startCol + 1, memo)
            );
        }

        return memo[startRow][startCol];
    }
}
