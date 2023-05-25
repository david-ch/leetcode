package davidch.leetcode.challenges.n2270;

public class Solution {

    public int waysToSplitArray(int[] nums) {
        var rightSum = 0L;
        for (var n: nums) {
            rightSum += n;
        }

        var result = 0;
        var leftSum = 0L;
        for (var i = 0; i < nums.length - 1; i++) {
            leftSum += nums[i];
            rightSum -= nums[i];

            if (leftSum >= rightSum) {
                result++;
            }
        }

        return result;
    }
}
