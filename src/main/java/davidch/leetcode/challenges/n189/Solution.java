package davidch.leetcode.challenges.n189;

public class Solution {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        if (k == 0) return;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private void reverse(int[] nums, int from, int to) {
        for (var i = (from + to) / 2; i >= from; i--) {
            final var tmp = nums[i];
            nums[i] = nums[to + from - i];
            nums[to + from - i] = tmp;
        }
    }
}
