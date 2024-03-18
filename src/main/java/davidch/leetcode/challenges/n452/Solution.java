package davidch.leetcode.challenges.n452;

import java.util.Arrays;

public class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (p1, p2) -> p1[0] > p2[0] ? 1 : -1);

        var arrows = 1;
        var currentArrowTo = points[0][1];
        for (var balloon : points) {
            if (balloon[0] > currentArrowTo) {
                arrows++;
                currentArrowTo = balloon[1];
            } else {
                currentArrowTo = Math.min(currentArrowTo, balloon[1]);
            }
        }

        return arrows;
    }
}
