package davidch.leetcode.challenges.n283;

public class Solution {
    public void moveZeroes(int[] nums) {
        var nextIdxToFill = 0;
        for (var i = 0; i < nums.length; i++) {
            if (nums[i] == 0) continue;

            nums[nextIdxToFill] = nums[i];
            nextIdxToFill++;
        }

        for (var i = nextIdxToFill; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
