package davidch.leetcode.challenges.n1833;

import java.util.Arrays;

public class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        var bars = 0;
        var idx = 0;
        while (idx < costs.length && costs[idx] <= coins) {
            coins -= costs[idx];
            bars++;
            idx++;
        }

        return bars;
    }
}
