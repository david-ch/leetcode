package davidch.leetcode.challenges.n85;

public class Solution {

    public int maximalRectangle(char[][] matrix) {
        final var count = new int[matrix[0].length];
        var result = 0;

        for (char[] chars : matrix) {
            for (var col = 0; col < chars.length; col++) {
                count[col] = chars[col] == '0' ? 0 : count[col] + 1;
                if (chars[col] == '0') continue;

                var minHeight = count[col];
                var cShift = 0;
                while (col - cShift >= 0 && count[col - cShift] != 0) {
                    minHeight = Math.min(minHeight, count[col - cShift]);
                    result = Math.max(result, minHeight * (cShift + 1));
                    cShift++;
                }
            }
        }

        return result;
    }
}
