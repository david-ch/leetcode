package davidch.leetcode.challenges.n977;

public class Solution {

    public int[] sortedSquares(int[] nums) {
        final var result = new int[nums.length];

        var left = 0;
        var right = nums.length - 1;

        for (int i = result.length - 1; i >= 0; i--) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                result[i] = nums[left] * nums[left];
                left++;
            } else {
                result[i] = nums[right] * nums[right];
                right--;
            }
        }

        return result;
    }
}
