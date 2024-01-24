package davidch.leetcode.challenges.n1848;

public class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        var dist = 0;
        while (start - dist >= 0 || start + dist < nums.length) {
            if (start - dist >= 0 && nums[start - dist] == target) return dist;
            if (start + dist < nums.length && nums[start + dist] == target) return dist;
            dist++;
        }
        return dist;
    }
}
