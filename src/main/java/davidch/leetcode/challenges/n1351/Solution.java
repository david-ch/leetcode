package davidch.leetcode.challenges.n1351;

public class Solution {
    public int countNegatives(int[][] grid) {
        var result = 0;
        var maxCol = grid[0].length - 1;
        for (var i = 0; i < grid.length; i++) {
            for (var j = 0; j <= maxCol; j++) {
                if (grid[i][j] < 0) {
                    result += (grid.length - i) * (maxCol - j + 1);
                    maxCol = j - 1;
                }
            }
        }

        return result;
    }
}
