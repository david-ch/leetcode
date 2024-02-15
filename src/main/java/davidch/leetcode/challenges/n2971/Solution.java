package davidch.leetcode.challenges.n2971;

import java.util.Arrays;

public class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        var sum = 0L;
        for (var n : nums) sum += n;

        var right = nums.length - 1;
        while (right > 0 && nums[right] >= sum - nums[right]) {
            sum -= nums[right];
            right--;
        }

        return right >= 2 ? sum : -1;
    }
}
