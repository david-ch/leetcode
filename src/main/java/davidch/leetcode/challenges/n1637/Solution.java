package davidch.leetcode.challenges.n1637;

import java.util.Arrays;

public class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        final var p = new int[points.length];
        for (var i = 0; i < p.length; i++) p[i] = points[i][0];
        Arrays.sort(p);

        var result = 0;
        for (var i = 1; i < p.length; i++)
            result = Math.max(result, p[i] - p[i - 1]);
        return result;
    }
}
