package davidch.leetcode.challenges.n973;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
    public int[][] kClosest(int[][] points, int k) {
        final var comparingDist = Comparator.<Point, Double>comparing(p -> p.dist);
        final var heap = new PriorityQueue<>(comparingDist.reversed());
        for (var p : points) {
            heap.add(new Point(p, Math.sqrt(p[0] * p[0] + p[1] * p[1])));
            if (heap.size() > k) heap.poll();
        }

        final var result = new int[k][2];
        for (var i = 0; i < k; i++) result[i] = heap.poll().coord;
        return result;
    }

    private record Point(int[] coord, double dist) {
    }
}
