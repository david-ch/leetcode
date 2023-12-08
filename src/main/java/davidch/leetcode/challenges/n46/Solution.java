package davidch.leetcode.challenges.n46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        return permute(Arrays.stream(nums).boxed().toList());
    }

    private List<List<Integer>> permute(List<Integer> nums) {
        if (nums.size() == 1) return List.of(nums);

        final var result = new ArrayList<List<Integer>>();
        for (var i = 0; i < nums.size(); i++) {
            final var remainingItems = new ArrayList<>(nums);
            remainingItems.remove(i);

            for (var suffix : permute(remainingItems)) {
                final var row = new ArrayList<Integer>();
                row.add(nums.get(i));
                row.addAll(suffix);
                result.add(row);
            }
        }

        return result;
    }
}
