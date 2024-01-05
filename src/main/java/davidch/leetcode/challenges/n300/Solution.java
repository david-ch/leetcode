package davidch.leetcode.challenges.n300;

import java.util.Arrays;

public class Solution {
    public int lengthOfLIS(int[] nums) {
        final var streak = new int[nums.length];
        streak[0] = nums[0];
        var streakLen = 1;

        for (var i = 1; i < nums.length; i++) {
            if (nums[i] > streak[streakLen - 1])
                streak[streakLen++] = nums[i];
            else {
                var idx = Arrays.binarySearch(streak, 0, streakLen, nums[i]);
                if (idx >= 0) continue;

                idx = -(idx + 1);
                streak[idx] = nums[i];
            }
        }

        return streakLen;
    }
}
