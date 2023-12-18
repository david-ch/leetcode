package davidch.leetcode.challenges.n69;

public class Solution {
    public int mySqrt(int x) {
        if (x < 2) return x;

        var left = 1;
        var right = x / 2;

        while (left <= right) {
            final var mid = (right + left) / 2;

            if (mid * mid == x) return mid;
            else if ((long) mid * mid > x) right = mid - 1;
            else left = mid + 1;
        }

        return right;
    }
}
