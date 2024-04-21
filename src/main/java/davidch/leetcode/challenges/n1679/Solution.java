package davidch.leetcode.challenges.n1679;

import java.util.Arrays;

public class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        var result = 0;
        var left = 0;
        var right = nums.length - 1;
        while (left < right) {
            final var sum = nums[left] + nums[right];
            if (sum == k) {
                result++;
                left++;
                right--;
            } else if (sum < k) left++;
            else right--;
        }
        return result;
    }
}
