package davidch.leetcode.challenges.n1413;

public class Solution {
    public int minStartValue(int[] nums) {
        var min = nums[0];
        var sum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            sum += nums[i];
            min = Math.min(min, sum);
        }

        return min < 0 ? -min + 1 : 1;
    }
}
