package davidch.leetcode.challenges.n1496;

import java.util.HashSet;

public class Solution {
    public boolean isPathCrossing(String path) {
        final var visitedPoints = new HashSet<Long>();
        var x = 0;
        var y = 0;
        visitedPoints.add(0L);
        for (var ch : path.toCharArray()) {
            if (ch == 'N') y--;
            else if (ch == 'S') y++;
            else if (ch =='E') x++;
            else x--;

            if (!visitedPoints.add(x * 100_000L + y)) return true;
        }

        return false;
    }
}
