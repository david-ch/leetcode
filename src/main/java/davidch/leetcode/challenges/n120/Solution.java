package davidch.leetcode.challenges.n120;

import java.util.List;

public class Solution {

    public int minimumTotal(List<List<Integer>> triangle) {
        final var memo = new Integer[triangle.size()][triangle.size()];

        final var lastRowNum = triangle.size() - 1;
        final var lastRow = triangle.get(lastRowNum);
        for (var col = 0; col < lastRow.size(); col++)
            memo[lastRowNum][col] = lastRow.get(col);

        return minimumTotal(triangle, 0, 0, memo);
    }

    private int minimumTotal(List<List<Integer>> triangle, int row, int col, Integer[][] memo) {
        if (memo[row][col] == null) {
            memo[row][col] = triangle.get(row).get(col) + Math.min(
                    minimumTotal(triangle, row + 1, col, memo),
                    minimumTotal(triangle, row + 1, col + 1, memo)
            );
        }

        return memo[row][col];
    }
}
