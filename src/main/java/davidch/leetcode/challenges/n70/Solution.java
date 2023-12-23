package davidch.leetcode.challenges.n70;

public class Solution {
    public int climbStairs(int n) {
        var prev = 1;
        var current = 1;

        for (var i = 1; i < n; i++) {
            var tmp = current;
            current = current + prev;
            prev = tmp;
        }

        return current;
    }
}
