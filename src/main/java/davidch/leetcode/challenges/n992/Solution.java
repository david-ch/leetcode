package davidch.leetcode.challenges.n992;

import java.util.HashMap;
import java.util.PriorityQueue;

public class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        final var lastOccurence = new HashMap<Integer, Integer>();

        final var q = new PriorityQueue<Integer>((a, b) -> lastOccurence.get(a) - lastOccurence.get(b));

        var left = 0;
        var right = 0;
        lastOccurence.put(nums[0], 0);
        q.add(nums[0]);

        while (lastOccurence.size() < k && right < nums.length - 1) {
            right++;
            lastOccurence.put(nums[right], right);
            q.remove(nums[right]);
            q.add(nums[right]);
        }

        var result = 0;
        if (lastOccurence.size() == k)
            result += lastOccurence.get(q.peek()) - left + 1;

        while (right < nums.length - 1) {
            right++;
            lastOccurence.put(nums[right], right);
            q.remove(nums[right]);
            q.add(nums[right]);

            if (lastOccurence.size() > k) {
                final var min = q.poll();
                left = lastOccurence.get(min) + 1;
                lastOccurence.remove(min);
            }

            if (lastOccurence.size() == k)
                result += lastOccurence.get(q.peek()) - left + 1;
        }

        return result;
    }
}
