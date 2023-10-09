package davidch.leetcode.challenges.n2208;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
    public int halveArray(int[] nums) {
        final var heap = new PriorityQueue<Double>(Comparator.reverseOrder());
        var sum = 0.0;
        for (var n : nums) {
            sum += n;
            heap.add((double) n);
        }

        var steps = 0;
        var result = sum;
        while (result > sum / 2) {
            final var n = heap.poll() / 2;
            result -= n;
            heap.add(n);
            steps++;
        }

        return steps;
    }
}
