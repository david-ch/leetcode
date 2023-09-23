package davidch.leetcode.challenges.n26;

public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 1) return 1;

        var filledIdx = 0;
        for (var i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) continue;
            filledIdx++;
            nums[filledIdx] = nums[i];
        }

        return filledIdx + 1;
    }
}
