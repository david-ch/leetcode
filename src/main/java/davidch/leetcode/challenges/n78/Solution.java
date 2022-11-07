package davidch.leetcode.challenges.n78;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;


public class Solution {

    public List<List<Integer>> subsets(int[] nums) {
        final var results = new ArrayList<List<Integer>>();
        collectSubsets(nums, 0, new ArrayList<>(), results::add);
        return results;
    }

    private void collectSubsets(int[] nums, int startingFrom, List<Integer> buffer, Consumer<List<Integer>> resultsCollector) {
        resultsCollector.accept(List.copyOf(buffer));

        for (var i = startingFrom; i < nums.length; i++) {
            buffer.add(nums[i]);
            collectSubsets(nums, i + 1, buffer, resultsCollector);
            buffer.remove(buffer.size() - 1);
        }
    }
}
