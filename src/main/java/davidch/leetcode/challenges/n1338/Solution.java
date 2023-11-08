package davidch.leetcode.challenges.n1338;

import java.util.HashMap;
import java.util.PriorityQueue;

public class Solution {

    public int minSetSize(int[] arr) {
        final var numCounts = new HashMap<Integer, Integer>();
        for (var num : arr) numCounts.put(num, numCounts.getOrDefault(num, 0) + 1);

        final var heap = new PriorityQueue<Integer>((a, b) -> b - a);
        for (var numCount : numCounts.entrySet()) heap.add(numCount.getValue());

        final var initialHeapSize = heap.size();

        final var halfArraySize = arr.length / 2;
        var currentArraySize = arr.length;
        while (currentArraySize > halfArraySize) currentArraySize -= heap.poll();

        return initialHeapSize - heap.size();
    }
}
