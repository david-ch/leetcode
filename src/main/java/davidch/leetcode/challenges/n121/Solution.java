package davidch.leetcode.challenges.n121;

public class Solution {
    public int maxProfit(int[] prices) {
        var min = prices[0];
        var result = 0;

        for (var i = 1; i < prices.length; i++)
            if (prices[i] > min) result = Math.max(result, prices[i] - min);
            else min = Math.min(min, prices[i]);

        return result;
    }
}
