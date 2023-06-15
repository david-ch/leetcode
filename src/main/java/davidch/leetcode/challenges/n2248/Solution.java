package davidch.leetcode.challenges.n2248;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public List<Integer> intersection(int[][] nums) {
        final var numbersCounts = new HashMap<Integer, Integer>();

        for (var i = 0; i < nums.length; i++) {
            for (var j = 0; j < nums[i].length; j++) {
                var number = nums[i][j];
                numbersCounts.put(number, numbersCounts.getOrDefault(number, 0) + 1);
            }
        }

        final var expectedCount = nums.length;
        final var result = new ArrayList<Integer>();
        for (var numberCount: numbersCounts.entrySet()) {
            if (numberCount.getValue().equals(expectedCount)) result.add(numberCount.getKey());
        }

        result.sort(Comparator.naturalOrder());
        return result;
    }
}

