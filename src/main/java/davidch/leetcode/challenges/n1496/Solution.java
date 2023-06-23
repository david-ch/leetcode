package davidch.leetcode.challenges.n1496;

import java.util.HashSet;

public class Solution {
    public boolean isPathCrossing(String path) {
        final var visitedPoints = new HashSet<Point>();
        var currentPosition = new Point(0, 0);
        visitedPoints.add(currentPosition);

        final var len = path.length();
        for (var i = 0; i < len; i++) {
            currentPosition = currentPosition.move(path.charAt(i));
            if (!visitedPoints.add(currentPosition)) return true;
        }

        return false;
    }

    private record Point(int x, int y) {
        Point move(char direction) {
            return switch (direction) {
                case 'N' -> new Point(x, y - 1);
                case 'S' -> new Point(x, y + 1);
                case 'E' -> new Point(x + 1, y);
                default -> new Point(x - 1, y);
            };
        }
    }
}
