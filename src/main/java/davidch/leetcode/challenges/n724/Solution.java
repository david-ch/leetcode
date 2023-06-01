package davidch.leetcode.challenges.n724;

public class Solution {
    public int pivotIndex(int[] nums) {
        var rightSum = 0;
        for (var i = 1; i < nums.length; i++) {
            rightSum += nums[i];
        }

        if (rightSum == 0) return 0;

        var leftSum = 0;
        for (var i = 1; i < nums.length; i++) {
            leftSum += nums[i - 1];
            rightSum -= nums[i];

            if (leftSum == rightSum) {
                return i;
            }
        }

        return -1;
    }
}
