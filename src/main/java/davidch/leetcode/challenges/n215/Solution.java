package davidch.leetcode.challenges.n215;

import java.util.PriorityQueue;

public class Solution {
    public int findKthLargest(int[] nums, int k) {
        final var heap = new PriorityQueue<Integer>();
        for (var n : nums) {
            heap.add(n);
            if (heap.size() > k) heap.poll();
        }
        return heap.poll();
    }
}
