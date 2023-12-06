package davidch.leetcode.challenges.n240;

public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (var row = 0; row < matrix.length; row++) {
            if (matrix[row][0] > target) return false;

            var left = 0;
            var right = matrix[row].length;
            while (left < right) {
                final var mid = (left + right) / 2;
                if (matrix[row][mid] == target) return true;
                else if (matrix[row][mid] > target) right = mid;
                else left = mid + 1;
            }
        }

        return false;
    }
}
