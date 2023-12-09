package davidch.leetcode.challenges.n31;

public class Solution {
    public void nextPermutation(int[] nums) {
        var i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) i--;

        if (i >= 0) {
            var j = nums.length - 1;
            while (nums[j] <= nums[i]) j--;

            var tmp = nums[j];
            nums[j] = nums[i];
            nums[i] = tmp;
        }

        i++;
        var j = nums.length - 1;
        while (i < j) {
            var tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
            i++;
            j--;
        }
    }
}
