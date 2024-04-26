package davidch.leetcode.challenges.n1289;

class Solution {
    public int minFallingPathSum(int[][] grid) {
        int[] prevRowMin = {0, -1};
        int[] thisRowMin = {0, -1};

        for (var col = 1; col < grid[0].length; col++) {
            if (grid[0][col] <= grid[0][prevRowMin[0]]) {
                prevRowMin[1] = prevRowMin[0];
                prevRowMin[0] = col;
            }
            else if (prevRowMin[1] == -1 || grid[0][col] < grid[0][prevRowMin[1]]) prevRowMin[1] = col;
        }

        for (var row = 1; row < grid.length; row++) {
            for (var col = 0; col < grid[row].length; col++) {
                grid[row][col] = grid[row][col]
                    + (col == prevRowMin[0] ? grid[row - 1][prevRowMin[1]] : grid[row - 1][prevRowMin[0]]);

                if (grid[row][col] <= grid[row][thisRowMin[0]]) {
                    thisRowMin[1] = thisRowMin[0];
                    thisRowMin[0] = col;
                }
                else if (thisRowMin[1] == -1 || grid[row][col] < grid[row][thisRowMin[1]]) thisRowMin[1] = col;
            }

            prevRowMin[0] = thisRowMin[0];
            prevRowMin[1] = thisRowMin[1];
            thisRowMin[0] = 0;
            thisRowMin[1] = -1;
        }

        return grid[grid.length - 1][prevRowMin[0]];
    }
}
