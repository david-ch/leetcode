package davidch.leetcode.challenges.n442;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        final var result = new ArrayList<Integer>();

        for (var i = 0; i < nums.length; i++) {
            final var val = Math.abs(nums[i]) - 1;
            if (nums[val] < 0) result.add(val + 1);
            else nums[val] = -nums[val];
        }

        return result;
    }
}
