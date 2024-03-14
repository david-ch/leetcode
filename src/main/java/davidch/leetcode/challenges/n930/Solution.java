package davidch.leetcode.challenges.n930;

public class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        final var seenSumsCount = new int[nums.length + 1];
        seenSumsCount[0] = 1;

        var result = 0;
        var sum = 0;
        for (var i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum - goal >= 0) result += seenSumsCount[sum - goal];
            seenSumsCount[sum]++;
        }

        return result;
    }
}
