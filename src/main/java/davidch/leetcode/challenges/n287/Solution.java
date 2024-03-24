package davidch.leetcode.challenges.n287;

public class Solution {
    public int findDuplicate(int[] nums) {
        var slow = nums[0];
        var fast = nums[0];

        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        fast = nums[0];
        while (slow != fast) {
            fast = nums[fast];
            slow = nums[slow];
        }

        return slow;
    }
}
