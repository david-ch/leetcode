package davidch.leetcode.challenges.n713;

public class Solution {

    public int numSubarrayProductLessThanK(int[] nums, int k) {
        var result = 0;
        var left = 0;
        var product = 1;
        for (int right = 0; right < nums.length; right++) {
            product *= nums[right];

            while (left <= right && product >= k) {
                product /= nums[left];
                left++;
            }

            result += right - left + 1;
        }

        return result;
    }
}
