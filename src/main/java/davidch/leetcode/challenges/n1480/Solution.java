package davidch.leetcode.challenges.n1480;

public class Solution {

    public int[] runningSum(int[] nums) {
        var lastSum = 0;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] + lastSum;
            lastSum = nums[i];
        }

        return nums;
    }
}
