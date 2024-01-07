package davidch.leetcode.challenges.n413;

public class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        var result = 0;
        var streakLen = 1;
        for (var i = 2; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]) streakLen++;
            else {
                result += streakLen * (streakLen - 1) / 2;
                streakLen = 1;
            }
        }
        result += streakLen * (streakLen - 1) / 2;
        return result;
    }
}
