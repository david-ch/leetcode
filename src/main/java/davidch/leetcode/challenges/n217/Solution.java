package davidch.leetcode.challenges.n217;

import java.util.HashSet;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        final var seenNumbers = new HashSet<Integer>();
        for (var i = 0; i < nums.length; i++) {
            if (!seenNumbers.add(nums[i])) return true;
        }

        return false;
    }
}
