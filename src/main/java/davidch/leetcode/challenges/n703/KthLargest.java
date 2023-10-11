package davidch.leetcode.challenges.n703;

import java.util.PriorityQueue;

public class KthLargest {

    private final PriorityQueue<Integer> q = new PriorityQueue<>();
    private final int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        for (var n : nums) q.offer(n);
    }

    public int add(int val) {
        q.offer(val);
        while (q.size() > k) q.poll();
        return q.peek();
    }
}
