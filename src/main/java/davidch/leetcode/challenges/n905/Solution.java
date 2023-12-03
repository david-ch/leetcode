package davidch.leetcode.challenges.n905;

public class Solution {

    public int[] sortArrayByParity(int[] nums) {
        var left = 0;
        var right = nums.length - 1;
        while (left < right) {
            if ((nums[left] & 1) == 1 && (nums[right] & 1) == 0) {
                var tmp = nums[left];
                nums[left] = nums[right];
                nums[right] = tmp;
                left++;
                right--;
            }

            if ((nums[left] & 1) == 0) left++;
            if ((nums[right] & 1) == 1) right--;
        }

        return nums;
    }
}
