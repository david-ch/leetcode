package davidch.leetcode.challenges.n322;

import java.util.Arrays;

public class Solution {

    public int coinChange(int[] coins, int amount) {
        final var memo = new int[amount + 1];
        Arrays.fill(memo, amount + 1);
        memo[0] = 0;

        for (var c : coins) {
            for (var i = c; i <= amount; i++) {
                memo[i] = Math.min(memo[i], memo[i - c] + 1);
            }
        }

        return memo[amount] > amount ? -1 : memo[amount];
    }
}
