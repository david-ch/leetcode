package davidch.leetcode.challenges.n861;

public class Solution {
    public int matrixScore(int[][] grid) {
        final var colsOnes = new int[grid[0].length];
        colsOnes[0] = grid.length;

        for (var row : grid)
            for (var col = 1; col < row.length; col++)
                colsOnes[col] += row[col] == row[0] ? 1 : 0;

        var result = 0;
        final var half = grid.length / 2;
        var pow = 1;
        for (var col = colsOnes.length - 1; col >= 0; col--) {
            result += pow * (colsOnes[col] <= half ? grid.length - colsOnes[col] : colsOnes[col]);
            pow *= 2;
        }

        return result;
    }
}
