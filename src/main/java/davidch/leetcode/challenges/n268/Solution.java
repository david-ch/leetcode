package davidch.leetcode.challenges.n268;

public class Solution {
    public int missingNumber(int[] nums) {
        var sum = nums.length * (nums.length + 1) / 2;
        for (var num : nums) {
            sum -= num;
        }
        return sum;
    }
}
