package davidch.leetcode.challenges.n1004;

public class Solution {

    public int longestOnes(int[] nums, int k) {
        var left = 0;

        for (int num : nums) {
            if (num == 0) k--;

            if (k < 0) {
                if (nums[left] == 0) k++;
                left++;
            }
        }

        return nums.length - left;
    }
}
