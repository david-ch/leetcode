package davidch.leetcode.challenges.n240;

public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        var row = matrix.length - 1;
        var col = 0;
        while (row >= 0 && col < matrix[0].length) {
            if (matrix[row][col] == target) return true;
            if (matrix[row][col] > target) row--;
            else col++;
        }
        return false;
    }
}
