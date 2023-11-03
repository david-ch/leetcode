package davidch.leetcode.challenges.n1481;

import java.util.HashMap;
import java.util.PriorityQueue;

public class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        final var numCounts = new HashMap<Integer, Integer>();
        for (int i : arr) numCounts.put(i, numCounts.getOrDefault(i, 0) + 1);

        final var minCount = new PriorityQueue<Integer>();
        for (var count : numCounts.values()) minCount.offer(count);

        var uniqueInts = numCounts.keySet().size();
        while (k > 0 && !minCount.isEmpty() && minCount.peek() <= k) {
            k -= minCount.poll();
            uniqueInts--;
        }

        return uniqueInts;
    }
}
