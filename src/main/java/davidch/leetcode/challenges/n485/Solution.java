package davidch.leetcode.challenges.n485;

public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        var maxStreak = 0;
        var streak = 0;

        for (var n : nums) {
            if (n == 0) {
                maxStreak = Math.max(maxStreak, streak);
                streak = 0;
            }
            else {
                streak++;
            }
        }

        return Math.max(maxStreak, streak);
    }
}
