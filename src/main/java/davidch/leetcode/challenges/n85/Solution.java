package davidch.leetcode.challenges.n85;

public class Solution {

    public static final int[] EMPTY = {0, 0};

    public int maximalRectangle(char[][] matrix) {
        final var count = new int[matrix.length][matrix[0].length][2];
        var result = 0;

        for (var row = 0; row < matrix.length; row++) {
            for (var col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == '0') continue;

                final var left = col == 0 ? EMPTY : count[row][col - 1];
                final var top = row == 0 ? EMPTY : count[row - 1][col];

                count[row][col][0] = left[0] + 1;
                count[row][col][1] = top[1] + 1;

                var minHeight = count[row][col][1];
                for (var c = 0; c < count[row][col][0]; c++) {
                    minHeight = Math.min(minHeight, count[row][col - c][1]);
                    result = Math.max(result, minHeight * (c + 1));
                }

                var minWidth = count[row][col][0];
                for (var r = 0; r < count[row][col][1]; r++) {
                    minWidth = Math.min(minWidth, count[row - r][col][0]);
                    result = Math.max(result, minWidth * (r + 1));
                }
            }
        }

        return result;
    }
}
