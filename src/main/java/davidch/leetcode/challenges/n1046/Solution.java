package davidch.leetcode.challenges.n1046;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
    public int lastStoneWeight(int[] stones) {
        final var heap = new PriorityQueue<Integer>(Comparator.reverseOrder());
        for (int stone : stones) heap.add(stone);

        while (heap.size() > 1) {
            final var y = heap.poll();
            final var x = heap.poll();
            if (x != y) heap.add(y - x);
        }

        return heap.isEmpty() ? 0 : heap.poll();
    }
}
