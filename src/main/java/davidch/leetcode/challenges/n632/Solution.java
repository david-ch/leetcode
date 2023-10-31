package davidch.leetcode.challenges.n632;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Solution {
    public int[] smallestRange(List<List<Integer>> nums) {
        final var q = new PriorityQueue<Item>(Comparator.comparing(item -> item.value));

        var currentMax = Integer.MIN_VALUE;
        for (var i = 0; i < nums.size(); i++) {
            q.offer(new Item(nums.get(i).get(0), i, 0));
            currentMax = Math.max(currentMax, nums.get(i).get(0));
        }

        final var result = new int[]{q.peek().value, currentMax};

        while (true) {
            final var previousMin = q.poll();
            if (previousMin.idx == nums.get(previousMin.list).size() - 1) break;
            final var newVal = new Item(
                    nums.get(previousMin.list).get(previousMin.idx + 1),
                    previousMin.list,
                    previousMin.idx + 1
            );
            q.offer(newVal);

            currentMax = Math.max(currentMax, newVal.value);
            final var currentMin = q.peek().value;
            if (result[1] - result[0] > currentMax - currentMin) {
                result[0] = currentMin;
                result[1] = currentMax;
            }
        }

        return result;
    }

    private record Item(int value, int list, int idx) {
    }
}
