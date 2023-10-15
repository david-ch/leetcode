package davidch.leetcode.challenges.n347;

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        final var counts = new HashMap<Integer, Integer>();
        for (var n : nums) counts.put(n, counts.getOrDefault(n, 0) + 1);

        final var heap = new PriorityQueue<Integer>(Comparator.comparing(counts::get));
        for (var n : counts.keySet()) {
            heap.add(n);
            if (heap.size() > k) heap.poll();
        }

        final var result = new int[k];
        var idx = 0;
        while (!heap.isEmpty()) {
            result[idx] = heap.poll();
            idx++;
        }

        return result;
    }
}
