package davidch.leetcode.challenges.n2462;

import java.util.PriorityQueue;

public class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        final var leftCandidates = new PriorityQueue<Integer>();
        var leftIdx = 0;

        final var rightCandidates = new PriorityQueue<Integer>();
        var rightIdx = costs.length - 1;

        while (rightIdx >= 0 && rightCandidates.size() < candidates) {
            rightCandidates.offer(costs[rightIdx]);
            rightIdx--;
        }

        while (leftIdx <= rightIdx && leftCandidates.size() < candidates) {
            leftCandidates.offer(costs[leftIdx]);
            leftIdx++;
        }

        var cost = 0L;
        while (k > 0) {
            if (rightCandidates.isEmpty() || (!leftCandidates.isEmpty() && leftCandidates.peek() <= rightCandidates.peek())) {
                cost += leftCandidates.poll();
                if (leftIdx <= rightIdx) {
                    leftCandidates.offer(costs[leftIdx]);
                    leftIdx++;
                }
            } else {
                cost += rightCandidates.poll();
                if (leftIdx <= rightIdx) {
                    rightCandidates.offer(costs[rightIdx]);
                    rightIdx--;
                }
            }

            k--;
        }

        return cost;
    }
}
