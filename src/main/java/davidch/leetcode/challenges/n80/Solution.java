package davidch.leetcode.challenges.n80;

public class Solution {
    public int removeDuplicates(int[] nums) {
        var filledIdx = 0;
        var secondMet = false;
        for (var i = 1; i < nums.length; i++) {
            if (nums[i] == nums[filledIdx] && secondMet) continue;
            secondMet = nums[i] == nums[filledIdx];
            filledIdx++;
            nums[filledIdx] = nums[i];
        }

        return filledIdx + 1;
    }
}
