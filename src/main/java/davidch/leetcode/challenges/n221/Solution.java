package davidch.leetcode.challenges.n221;

public class Solution {
    public int maximalSquare(char[][] matrix) {
        final var memo = new int[matrix.length + 1][matrix[0].length + 1];

        var result = 0;

        for (var row = 0; row < matrix.length; row++)
            for (var col = 0; col < matrix[row].length; col++)
                if (matrix[row][col] == '1') {
                    memo[row + 1][col + 1] = 1 + Math.min(
                            memo[row][col + 1],
                            Math.min(memo[row + 1][col], memo[row][col])
                    );

                    result = Math.max(result, memo[row + 1][col + 1]);
                }

        return result * result;
    }
}
