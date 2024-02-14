package davidch.leetcode.challenges.n2149;

public class Solution {
    public int[] rearrangeArray(int[] nums) {
        final var result = new int[nums.length];

        var positiveIdx = 0;
        var negativeIdx = 1;

        for (var i = 0; i < result.length; i++) {
            if (nums[i] > 0) {
                result[positiveIdx] = nums[i];
                positiveIdx+=2;
            } else {
                result[negativeIdx] = nums[i];
                negativeIdx+=2;
            }
        }

        return result;
    }
}
