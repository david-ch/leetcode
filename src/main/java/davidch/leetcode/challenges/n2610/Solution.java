package davidch.leetcode.challenges.n2610;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        final var count = new int[201];

        final var result = new ArrayList<List<Integer>>();
        for (var n: nums) {
            if (result.size() < count[n] + 1) result.add(new ArrayList<>());
            result.get(count[n]).add(n);
            count[n]++;
        }

        return result;
    }
}
