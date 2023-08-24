package davidch.leetcode.challenges.n27;

public class Solution {
    public int removeElement(int[] nums, int val) {
        var slow = 0;
        for (var fast = 0; fast < nums.length; fast++) {
            if (nums[fast] == val) continue;
            nums[slow] = nums[fast];
            slow++;
        }

        return slow;
    }
}
