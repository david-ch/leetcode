package davidch.leetcode.challenges.n1962;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
    public int minStoneSum(int[] piles, int k) {
        final var heap = new PriorityQueue<Integer>(Comparator.reverseOrder());
        var sum = 0;

        for (var n : piles) {
            sum += n;
            heap.add(n);
        }

        for (var i = 0; i < k; i++) {
            var num = heap.poll();
            var diff = (int) Math.floor(num / 2.0);
            sum -= diff;
            heap.add(num - diff);
        }

        return sum;
    }
}
