package davidch.leetcode.challenges.n3075;

import java.util.Arrays;

public class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        var result = 0L;
        var turn = 0;
        for (var i = happiness.length - 1; turn < k; i--, turn++)
            result += Math.max(0, happiness[i] - turn);

        return result;
    }
}
