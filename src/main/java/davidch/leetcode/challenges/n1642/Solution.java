package davidch.leetcode.challenges.n1642;

import java.util.PriorityQueue;

public class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        final var laddersUsed = new PriorityQueue<Integer>();
        for (var i = 0; i < heights.length - 1; i++) {
            final var heightDiff = heights[i + 1] - heights[i];
            if (heightDiff <= 0) continue;

            if (ladders > 0) {
                ladders--;
                laddersUsed.add(heightDiff);
                continue;
            }

            if (!laddersUsed.isEmpty() && laddersUsed.peek() < heightDiff && bricks >= laddersUsed.peek()) {
                bricks -= laddersUsed.poll();
                laddersUsed.add(heightDiff);
                continue;
            }

            if (bricks >= heightDiff) {
                bricks -= heightDiff;
                continue;
            }

            return i;
        }

        return heights.length - 1;
    }
}
