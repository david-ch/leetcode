package davidch.leetcode.challenges.n416;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public boolean canPartition(int[] nums) {
        final var memo = new ArrayList<Map<State, Boolean>>();
        for (var i = 0; i < nums.length; i++)
            memo.add(new HashMap<>());

        return canPartition(nums, 0, 0, 0, memo);
    }

    private boolean canPartition(int[] num, int a, int b, int i, List<Map<State, Boolean>> memo) {
        if (i == num.length) return a == b;

        var result = memo.get(i).get(new State(a, b));
        if (result == null) {
            result = canPartition(num, a + num[i], b, i + 1, memo) || canPartition(num, a, b + num[i], i + 1, memo);
            memo.get(i).put(new State(a, b), result);
        }

        return result;
    }

    private record State(int a, int b) {
    }
}
