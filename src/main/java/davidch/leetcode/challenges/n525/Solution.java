package davidch.leetcode.challenges.n525;

import java.util.HashMap;

public class Solution {
    public int findMaxLength(int[] nums) {
        final var balanceToIdx = new HashMap<Integer, Integer>();
        balanceToIdx.put(0, -1);
        var result = 0;

        var balance = 0;
        for (var i = 0; i < nums.length; i++) {
            balance += nums[i] == 0 ? -1 : 1;

            final var sameBalance = balanceToIdx.get(balance);
            if (sameBalance != null) result = Math.max(result, i - sameBalance);
            else balanceToIdx.put(balance, i);
        }

        return result;
    }
}
