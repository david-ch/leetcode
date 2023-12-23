package davidch.leetcode.challenges.n70;

public class Solution {
    public int climbStairs(int n) {
        final var memo = new int[n + 1];
        memo[0] = 1;
        memo[1] = 1;

        for (var i = 2; i <= n; i++)
            memo[i] = memo[i - 1] + memo[i - 2];

        return memo[n];
    }
}
