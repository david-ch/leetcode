package davidch.leetcode.challenges.n2398;

import java.util.Deque;
import java.util.LinkedList;

public class Solution {

    public int maximumRobots(int[] chargeTimes, int[] runningCosts, long budget) {
        final Deque<Integer> maxChargeTimes = new LinkedList<>();

        var result = 0;
        var runningCostsSum = 0L;
        var left = -1;

        for (var right = 0; right < chargeTimes.length; right++) {
            while (!maxChargeTimes.isEmpty() && chargeTimes[maxChargeTimes.peekLast()] < chargeTimes[right])
                maxChargeTimes.pollLast();
            maxChargeTimes.offerLast(right);

            runningCostsSum += runningCosts[right];

            long currentBudget = chargeTimes[maxChargeTimes.peekFirst()] + (right - left) * runningCostsSum;
            while (currentBudget > budget && left < right) {
                left++;
                if (!maxChargeTimes.isEmpty() && maxChargeTimes.peekFirst() == left) maxChargeTimes.pollFirst();
                runningCostsSum -= runningCosts[left];

                currentBudget = right == left ? 0 : chargeTimes[maxChargeTimes.peekFirst()] + (right - left) * runningCostsSum;
            }

            if (currentBudget <= budget) result = Math.max(result, right - left);
        }

        return result;
    }
}
