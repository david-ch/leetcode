package davidch.leetcode.challenges.n35;

public class Solution {
    public int searchInsert(int[] nums, int target) {
        var left = 0;
        var right = nums.length - 1;

        while (left <= right) {
            final var mid = (left + right) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) right = mid - 1;
            else left = mid + 1;
        }

        return left;
    }
}
