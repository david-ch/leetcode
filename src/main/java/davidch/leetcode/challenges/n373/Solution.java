package davidch.leetcode.challenges.n373;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        final var heap = new PriorityQueue<Pair>(Comparator.comparing(p -> p.sum));
        final var n1Len = Math.min(nums1.length, k);
        final var n2Last = Math.min(nums2.length, k) - 1;

        for (var i = 0; i < n1Len; i++) {
            heap.offer(new Pair(i, 0, nums1[i] + nums2[0]));
        }

        final var result = new ArrayList<List<Integer>>();

        while (!heap.isEmpty() && result.size() < k) {
            final var pair = heap.poll();
            result.add(List.of(nums1[pair.n1], nums2[pair.n2]));

            if (pair.n2 < n2Last) {
                heap.offer(new Pair(pair.n1, pair.n2 + 1, nums1[pair.n1] + nums2[pair.n2 + 1]));
            }
        }

        return result;
    }

    private record Pair(int n1, int n2, int sum) {
    }
}
