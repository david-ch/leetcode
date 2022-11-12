package davidch.leetcode.challenges.n219;

import java.util.HashMap;

public class Solution {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        final var valueToLastOccurrenceIdx = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (valueToLastOccurrenceIdx.containsKey(nums[i]) && i - valueToLastOccurrenceIdx.get(nums[i]) <= k) {
                return true;
            }

            valueToLastOccurrenceIdx.put(nums[i], i);
        }

        return false;
    }
}
