package davidch.leetcode.challenges.n1475;

import java.util.Stack;

public class Solution {
    public int[] finalPrices(int[] prices) {
        final var discountCandidatesIndexes = new Stack<Integer>();
        final var result = new int[prices.length];

        for (var i = prices.length - 1; i >= 0; i--) {
            while (!discountCandidatesIndexes.isEmpty() && prices[discountCandidatesIndexes.peek()] > prices[i])
                discountCandidatesIndexes.pop();

            result[i] = prices[i] - (discountCandidatesIndexes.isEmpty() ? 0 : prices[discountCandidatesIndexes.peek()]);

            discountCandidatesIndexes.push(i);
        }

        return result;
    }
}
