package davidch.leetcode.challenges.n787;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        final var memo = new int[n][n][k + 1];
        final var prices = new HashMap<Integer, Map<Integer, Integer>>();
        for (var flight : flights)
            prices.computeIfAbsent(flight[0], k1 -> new HashMap<>())
                    .put(flight[1], flight[2]);

        final var result = findCheapestPrice(prices, 0, src, dst, k, memo);
        return result == Integer.MAX_VALUE ? -1 : result;
    }

    public int findCheapestPrice(Map<Integer, Map<Integer, Integer>> prices, int currentCost, int src, int dst, int k, int[][][] memo) {
        if (k < 0) return Integer.MAX_VALUE;
        if (memo[src][dst][k] == 0) {
            final var nextDests = prices.get(src);
            if (nextDests == null) {
                memo[src][dst][k] = Integer.MAX_VALUE;
                return Integer.MAX_VALUE;
            }

            var result = Integer.MAX_VALUE;
            for (var nextDest : nextDests.entrySet()) {
                if (nextDest.getKey() == dst) result = Math.min(result, nextDest.getValue());
                else
                    result = Math.min(result, findCheapestPrice(prices, nextDest.getValue(), nextDest.getKey(), dst, k - 1, memo));
            }

            memo[src][dst][k] = result;
        }

        return memo[src][dst][k] == Integer.MAX_VALUE ? Integer.MAX_VALUE : currentCost + memo[src][dst][k];
    }
}