package davidch.leetcode.challenges.n593;

public class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        var dist1 = -1.0;
        var dist1Count = 0;
        var dist2 = -1.0;
        var dist2Count = 0;

        final int[][][] measurements = {
            {p1, p2},
            {p1, p3},
            {p1, p4},
            {p2, p3},
            {p2, p4},
            {p3, p4}
        };

        for (var m : measurements) {
            final var dist = dist(m[0], m[1]);
            if (dist == 0) return false;
            if (dist1 == -1.0 || dist1 == dist) {
                dist1 = dist;
                dist1Count++;
            }
            else if (dist2 == -1.0 || dist2 == dist) {
                dist2 = dist;
                dist2Count++;
            }
            else return false;
        }

        return dist1Count == 2 && dist2Count == 4 || dist1Count == 4 && dist2Count == 2;
    }

    private double dist(int[] p1, int[] p2) {
        final var a = p2[0] - p1[0];
        final var b = p2[1] - p1[1];
        return Math.sqrt(a * a + b * b);
    }
}
